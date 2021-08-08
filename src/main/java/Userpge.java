public class Userpge {
	WebDriver driver = null;
	@BeforeMethod
	public void beforeMethode() {
	
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("file:///C:/Users/Amruta/Downloads/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		 driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		 driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
		 
		}
	//method for reading excel shit returns String cell

	
public String getCellData(int row , int col) {
		
		FileInputStream fis = null;
		Workbook wb = null;
		try {
			fis = new FileInputStream("TestData.xls"); 
			wb= wb.getWorkbook(fis);
			}catch(Exception e) {
				e.printStackTrace();
			}
		Sheet sh=wb.getSheet("table");
		Cell cell = sh.getCell(col, row);
		return cell.getContents();
		
		
}

//method for reading rows and col sheet returning int
public int getRowsCol() {
	
	FileInputStream fis = null;
	Workbook wb = null;
	try {
		fis = new FileInputStream("TestData.xls"); 
		wb= wb.getWorkbook(fis);
		}catch(Exception e) {
			e.printStackTrace();
		}
	Sheet sh=wb.getSheet("table");
	int row1 = sh.getRows();
	int coll = sh.getColumns();

	return coll;
	}


// verifying table by arraylis..printing table
@Test
public void verifyTableArrayList() throws BiffException, IOException {
	
List<WebElement>rows	=driver.findElements(By.xpath("//tr"));
ArrayList<String> extData = new ArrayList<String>();
ArrayList<String> actData = new ArrayList<String>();
List<WebElement> data=null;
for(WebElement row1:rows) {
	if(rows.indexOf(row1)==0)
		 data = row1.findElements(By.tagName("th"));
	else
		 data = row1.findElements(By.tagName("td"));
	
	for(WebElement value :data) {
		String tableContentText=value.getText();
		System.out.print(tableContentText+"   ");
		actData.add(tableContentText);
	}
	System.out.println();
	
}
System.out.println("acatual table"+actData);
// expected list of table
WebDriver driver = null;

FileInputStream fis = new FileInputStream("TestData.xls");

Workbook wb=Workbook.getWorkbook(fis);
Sheet sh=wb.getSheet("table");

int row=sh.getRows();

int col = sh.getColumns();
System.out.println(row+" "+col); 


for(int i=0;i<row;i++) {
	for(int j = 0;j<col;j++) {
		Cell c = sh.getCell(j, i);
		String data3=c.getContents();
		extData.add(data3);
		System.out.print(data3+" ");
	}
	System.out.println();
}
System.out.println("expected table"+extData);

Assert.assertEquals(actData, extData);
	
	
}


//verifying table by Hashmap
@Test
public void verifyTableHashmap() {

}
//method for reading rows and col sheet returning boolean
public Boolean getCellDataBoolean(int row , int col) {
	
	FileInputStream fis = null;
	Workbook wb = null;
	try {
		fis = new FileInputStream("TestData.xls"); 
		
		wb= wb.getWorkbook(fis);
		}catch(Exception e) {
			e.printStackTrace();
		}
	Sheet sh=wb.getSheet("table");
	Cell cell = sh.getCell(col, row);
	String contains=cell.getContents();
	return true;
	
}
	@Test
	public void checkHeadingOfpage() {
		driver.get("file:///C:/Users/Amruta/Downloads/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/users.html");
	String actMsg=	driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[1]/h1")).getText();
	String expmsg="Users";
	
	Assert.assertEquals(actMsg, expmsg);
	
	}
	
	
	public int checkedRowOFTable() throws Exception {
		driver.get("file:///C:/Users/Amruta/Downloads/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/users.html");
		
		Workbook wb = null;

		try {
			FileInputStream fis = new FileInputStream("TestData.xls");
			wb = Workbook.getWorkbook(fis);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		Sheet sh = wb.getSheet("table1");
		int row = sh.getRows();
		System.out.println("expected row"+row);
		
		return row;
	
	
		
	}
	
	// for row no
	@Test
	public void checkRowActaulRows() throws Exception {
		
	int row =	getRowsCol();
		System.out.println("expected row"+row);
		List<WebElement> rows = driver.findElements(By.xpath("//tr"));
		int a=rows.size();
		System.out.println("actual row"+a);
		Assert.assertEquals(a, row);
		
		
	}
	
	// for coloumn number.....need to ask
		@Test
		public void checkRowActaulcol() throws Exception {
			
		int coll =	getRowsCol();
		
		
		
			System.out.println("expected col"+coll);
			List<WebElement> rows = driver.findElements(By.xpath("//th"));
			int a=rows.size();
			System.out.println("actual row"+a);
			Assert.assertEquals(a, coll);
			
			
		}
	
	
		
		
		
	
	// for mail containg @gmail.com
	public ArrayList<String> checkedExpextedEmail() throws Exception {
		driver.get("file:///C:/Users/Amruta/Downloads/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/users.html");
		ArrayList<String> extData = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("TestData.xls");
		Workbook wb = Workbook.getWorkbook(fis);
		Sheet sh = wb.getSheet("mail");
		
		int row = sh.getRows();
		int col=sh.getRows();
	for(int i = 0;i<row;i++) {
		for(int j=0;j<col;j++) {
			Cell content=sh.getCell(j, i);
			String s=content.getContents();
			extData.add(s);
			
		}}
	return extData;
	}
	
	// veryfimg email from ebpage only
	@Test
	public void verifyEmail() {
		
		driver.get("file:///C:/Users/Amruta/Downloads/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/users.html");
		boolean flag = false;
		ArrayList<Boolean>al = new ArrayList<Boolean>();
		List<WebElement> email = driver.findElements(By.xpath("//td[3]"));
		for(WebElement element : email) {
			
			String text=element.getText();
		
	if(text.contains("@gmail.com")) {
		System.out.println("correct Email id is"+text);
		al.add(!flag);}
		else {
			System.out.println("incoorct mo no is "+text);
		}
	}
		System.out.println("Actul ArrayLIst"+al);
			
		}
	
	// verifying containg email @gmail from exel sheet
	@Test
	public void verifyEmailContaingCom() {
			// actaul list of email
			driver.get("file:///C:/Users/Amruta/Downloads/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/users.html");
			boolean flag = false;
			ArrayList<String>ActaulEmail = new ArrayList<String>();
			ArrayList<String>ExpectedEmail = new ArrayList<String>();
			List<WebElement> email = driver.findElements(By.xpath("//td[3]"));
			for(WebElement element : email) {
				
				String text=element.getText();
			
		if(text.contains("@gmail.com")) {
			String emaill= text;
			System.out.println(" correct Email id contaianng @gamil--"+text);
			ActaulEmail.add(emaill);
			
		}
			
			else {
				System.out.println("incoorct mo no is "+text);
			}
		}
			System.out.println("Actul ArrayLIst"+ActaulEmail);
				
		// expected list of email
			
			for(int i =1 ; i<5;i++) {
				String data=getCellData(i, 2);
				if(data.contains("@gmail")) {
					String emaill = data;
					ExpectedEmail.add(emaill);
				}else {
					System.out.println("incooect email id is"+data);
				}
			}
			System.out.println("expected email"+ExpectedEmail);
			
			Assert.assertEquals(ActaulEmail, ExpectedEmail);
			}
	
	
// veryfing state from webtable	
		
		@Test
		public void verifyState() {
			
			driver.get("file:///C:/Users/Amruta/Downloads/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/users.html");
			
			List<WebElement> email = driver.findElements(By.xpath("//td[3]"));
			for(WebElement element : email) {
				
				String text=element.getText();
			
				boolean flag = text.equals("Maharashtra")||text.equals("Punjab");
				
				Assert.assertTrue(flag);
			}}
		
		
		
		//printing the perticular user from perticular state
		
		@Test
		public void verifyingUserFromMaharastrra() {

			driver.get("file:///C:/Users/Amruta/Downloads/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/users.html");
		List<WebElement>Users = driver.findElements(By.xpath("//td[2]"));
		List<WebElement>states = driver.findElements(By.xpath("//td[7]"));
		
		ArrayList<String>accptedList = new ArrayList<String>();
		ArrayList<String>epectedLIst = new ArrayList<String>();
		
		
		for(int j=0;j<Users.size();j++) {
			String ActUser = Users.get(j).getText();
			String ActState = states.get(j).getText();
			//System.out.println(ActUser+" "+ActState);
			if(ActState.equals("Maharashtra")) {
				String actaulData = ActUser;
				accptedList.add(actaulData);
	
	// expected list from exel
				for(int i = 1;i<5;i++) {
					String exData=getCellData(i, 6);// maharastra
					if(exData.equals("Maharashtra")) {// true
						String exUser =getCellData(i, 1);// kiran
						epectedLIst.add(exUser);
						
					}
				}
				
				System.out.println("expected list of candidte Maharatra"+epectedLIst);
				Assert.assertEquals(accptedList, epectedLIst);
				
				}}}
		
		
		//veryfing user from Panjab
			@Test
			public void verifyingUserFromPanjab() {

				driver.get("file:///C:/Users/Amruta/Downloads/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/users.html");
			List<WebElement>Users = driver.findElements(By.xpath("//td[2]"));
			List<WebElement>states = driver.findElements(By.xpath("//td[7]"));
			
			ArrayList<String>accptedList = new ArrayList<String>();
			ArrayList<String>epectedLIst = new ArrayList<String>();
			
			
			for(int j=0;j<Users.size();j++) {
				String ActUser = Users.get(j).getText();
				String ActState = states.get(j).getText();
				//System.out.println(ActUser+" "+ActState);
				if(ActState.equals("Punjab")) {
					String actaulData = ActUser;
					accptedList.add(actaulData);
					
				
				}
		}
		System.out.println("actaul list of candidte from Punjab"+accptedList);
		
		
		// expected list from exel
		
		for(int i = 1;i<5;i++) {
			String exData=getCellData(i, 6);// maharastra
			if(exData.equals("Punjab")) {// true
				String exUser =getCellData(i, 1);// kiran
				epectedLIst.add(exUser);
				
			}
		}
		
		System.out.println("expected list of candidte from Punjab"+epectedLIst);
		Assert.assertEquals(accptedList, epectedLIst);
		
		}
			
//verifying state of prticular user using hashmap

			@Test
		public void verifyUserFromMaharastraHashMap() {
				List<WebElement>state = driver.findElements(By.xpath("//td[7]")); // [kiran, sagar,monica,kimaya]
				List<WebElement>actUser= driver.findElements(By.xpath("//td[2]"));//[male, male, female , female]
				
				HashMap<Integer , List<String>>actData = new HashMap<Integer , List<String>>();
				HashMap<Integer , List<String>>exptData = new HashMap<Integer , List<String>>();
				for(int i=0;i<state.size();i++) {
					String userName =actUser.get(i).getText();
					//System.out.println(userName);
					String statee =state.get(i).getText();
					//System.out.println(statee);

					if(statee.equals("Maharashtra")) {
						
						List<String> alList= new ArrayList<String>();
						
						alList.add(userName);
						alList.add(statee);
						actData.put(i, alList);
					}

				}
				System.out.println("Actaula datac"+actData);
			
				//expeted data from exel
				for(int j=1;j<5;j++) {

					String  uname = getCellData(j, 1);// 1,1--kiran
					String  exState = getCellData(j, 6);// 1,5 male
					if(exState.equals("Maharashtra")) {
					List<String> alexpected= new ArrayList<String>();
					
					alexpected.add(uname);
					alexpected.add(exState);
					exptData.put(j-1, alexpected);//--0, alexpected
					
				}}
				
				System.out.println("expected lis"+exptData);
				System.out.println("Actaula list"+actData);
					Assert.assertEquals(actData, exptData);
			
			}
	
// verifying gender and user using hashmap
@Test
			
                public void testUserAndGenger() {                                           //  0    1     2      3
				List<WebElement>uNames = driver.findElements(By.xpath("//td[2]")); // [kiran, sagar,monica,kimaya]
				List<WebElement>gender= driver.findElements(By.xpath("//td[6]"));//[male, male, female , female]
				
				HashMap<Integer , List<String>>actData = new HashMap<Integer , List<String>>();
				HashMap<Integer , List<String>>exptData = new HashMap<Integer , List<String>>();
				
				
				for(int i=0;i<uNames.size();i++) {  //i =0
					
					String UserName= uNames.get(i).getText();// i=0--kiran...1=sagar..2=monica...3=kimaya
					String Gender= gender.get(i).getText();  // i=0 --male......male....female...female
					
					List<String> al= new ArrayList<String>();
					al.add(Gender);//---->adding male to al---index is 0[male,kiran,male sagar,female,monica,female kiamaya]
					al.add(UserName);//--- >adding kiran to al---- index is 0[0 male kiran]
					actData.put(i, al);//-put elements of 0 index of al in hm-
					//{0=[male kiran],}
				}

				// fetching from exel
				for(int j =1;j<=4;j++) {
					
					String  uname = getCellData(j, 1);// 1,1--kiran
					String  GenderExp = getCellData(j, 5);// 1,5 male
					List<String> alexpected= new ArrayList<String>();
					alexpected.add(GenderExp);
					alexpected.add(uname);
					exptData.put(j-1, alexpected);//--0, alexpected
					
				}
				
				
				System.out.println(actData);
				System.out.println(exptData);
				Assert.assertEquals(actData, exptData);
				
					
		}

@Test

public void testUserAndGengerUsingHashMap() {                                           //  0    1     2      3
List<WebElement>uNames = driver.findElements(By.xpath("//td[2]")); // [kiran, sagar,monica,kimaya]
List<WebElement>gender= driver.findElements(By.xpath("//td[6]"));//[male, male, female , female]

HashMap<Integer , List<String>>actData = new HashMap<Integer , List<String>>();
HashMap<Integer , List<String>>exptData = new HashMap<Integer , List<String>>();


for(int i=0;i<uNames.size();i++) {  //i =0
	
	String UserName= uNames.get(i).getText();// i=0--kiran...1=sagar..2=monica...3=kimaya
	String Gender= gender.get(i).getText();  // i=0 --male......male....female...female
	if(Gender.equals("Male")) {
	List<String> al= new ArrayList<String>();
	al.add(Gender);//---->adding male to al---index is 0[male,kiran,male sagar,female,monica,female kiamaya]
	al.add(UserName);//--- >adding kiran to al---- index is 0[0 male kiran]
	actData.put(i, al);//-put elements of 0 index of al in hm-
	System.out.println("in the table "+ UserName +" is " +Gender);
	//{0=[male kiran],}
}}
System.out.println("actaul list of male user is"+actData);

// fetching from exel
for(int j =1;j<=4;j++) {
	
	String  uname = getCellData(j, 1);// 1,1--kiran
	String  GenderExp = getCellData(j, 5);// 1,5 male
	List<String> alexpected= new ArrayList<String>();
	if(GenderExp.equals("Male")) {
	alexpected.add(GenderExp);
	alexpected.add(uname);
	exptData.put(j-1, alexpected);//--0, alexpected
	
}}

System.out.println("expected list of male user is"+actData);
System.out.println(actData);
System.out.println(exptData);
Assert.assertEquals(actData, exptData);

	
}
		//print the mobile no having1 10 digits
			@Test
			public void verify_10_Digit_Mobile() {
				// actaul from webPage
				driver.get("file:///C:/Users/Amruta/Downloads/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/users.html");
				List<WebElement> mobile = driver.findElements(By.xpath("//td[4]"));
				ArrayList<Boolean>alAcutal = new ArrayList<Boolean>();
				ArrayList<Boolean>alExpected = new ArrayList<Boolean>();
				Boolean flag=false;
				for(WebElement element : mobile) {
					
					String text=element.getText();
					if(text.length()==10) {
						System.out.println("Correct mob no is "+text);
					
						alAcutal.add(!flag);}
					
				}
				System.out.println("actual list of mob"+alAcutal);
		
	
	}
		
// not valid test case only for practicing purpose		
	@Test
	public void verifyMobile() {
		// actaul from webPage
		driver.get("file:///C:/Users/Amruta/Downloads/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/users.html");
		List<WebElement> mobile = driver.findElements(By.xpath("//td[4]"));
		ArrayList<Boolean>alAcutal = new ArrayList<Boolean>();
		ArrayList<Boolean>alExpected = new ArrayList<Boolean>();
		Boolean flag=false;
		for(WebElement element : mobile) {
			
			String text=element.getText();
			if(text.length()==10) {
				System.out.println("Correct mob no is "+text);
			
				alAcutal.add(!flag);}
			
		}
		System.out.println("actual list of mob"+alAcutal);
		// expected from exel sheet
           
		for(int i=1;i<5;i++) {
			
			String data = getCellData(i, 3);//  (1,3)9898989898..(2,3)-999999999

			if(data.length()==10) {// 999999999----true

				Boolean correctMon= getCellDataBoolean(i, 3);//.....true
				System.out.println("correct mob no is"+correctMon);
	             System.out.println(correctMon);
	             alExpected.add(correctMon);
	}

		}
		
		System.out.println("expected list"+alExpected);
		}

	
	

	// verifying gender by making row dyanmic	
	/*@Test
	public void verifyMalegender() {
		
		driver.get("file:///C:/Users/Amruta/Downloads/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/users.html");
		ArrayList<String> actData = new ArrayList<String>();
		ArrayList<String> expData = new ArrayList<String>();
		List<WebElement> genders = driver.findElements(By.xpath("//td[6]"));//[Male Male Female Female]
		List<WebElement> noRow = driver.findElements(By.xpath("//tr"));
		List<WebElement> genderCOl = driver.findElements(By.xpath("//td[6]"));
		List<WebElement> userCOl = driver.findElements(By.xpath("//td[2]"));
		for(WebElement gender : genders) {
			
			
			if(gender.getText().equals("Male")) { // (Male equals to Male)
				
				int row = genders.indexOf(gender)+2;//2 // int row = genders.indexof(0+2)=2....... 1+2=3
				//System.out.println(row);----2-----3
				actData.add(driver.findElement(By.xpath("//tr["+row+"]/td[2]")).getText());
				                                       //      tr[2]/td[2]=kiran
				                                        //     tr[3]/td[2]sagar
			}
		
		}
		System.out.println(actData);
		for(int i = 1;i<noRow.size();i++) {
		//	String data= getCellData(i, );
			if(data.equals("Male")) {
				//String UserName =  getCellData(i, genderCOl);
				//expData.add(UserName);
			
			}
		}
		
		System.out.println("expected list of male candidtaee" + expData ) ;
		
		Assert.assertEquals(actData, expData);
		}*/
	@Test
	// verifying two list gender and userName
	public void verifyMale() {
		List<WebElement>uNames = driver.findElements(By.xpath("//td[2]")); // [kiran, sagar,monica,kimaya]
		List<WebElement>gender= driver.findElements(By.xpath("//td[6]"));//[male, male, female , female]
		
		ArrayList<String>accptedtedUser = new ArrayList<String>();
		ArrayList<String>expetedUser = new ArrayList<String>();
		//ArrayList<Boolean>al = new ArrayList<Boolean>();
		
		for(int i=0;i<uNames.size();i++) {
			String UserName= uNames.get(i).getText();// i=0--kiran...1=sagar..2=monica...3=kimaya
			String Gender= gender.get(i).getText(); 
			if(Gender.equals("Male")) {
				System.out.println("male user is"+( uNames.get(i).getText()));
			}
			accptedtedUser.add(Gender);
			
		}
		System.out.println("actaul list of"+accptedtedUser);
		

		
		for(int i=1;i<5;i++) {
			
			String data = getCellData(i, 5);//1,5----male,,,,,2,5--male....3,5 female
			if(data.equals("Male")) {
				System.out.println("Male user is " + getCellData(i, 1));}//--- kiran,sagar,monica
			else {System.out.println("female user is "+getCellData(i, 1));}
			expetedUser.add(data);
		}
		System.out.println(expetedUser);
		
		Assert.assertEquals(accptedtedUser, expetedUser);
	
	}
	

	
	//verifying users gender from excel
	@Test
	public void verifyMaleUser() {
		List<WebElement>uNames = driver.findElements(By.xpath("//td[2]")); // [kiran, sagar,monica,kimaya]
		List<WebElement>gender= driver.findElements(By.xpath("//td[6]"));//[male, male, female , female]
		String Name=null;
		ArrayList<String>accptedtedUser = new ArrayList<String>();//arraylist for male
		ArrayList<String>expetedUser = new ArrayList<String>();
		
		ArrayList<String>accptedtedFemaleUser = new ArrayList<String>();// array list for female
		ArrayList<String>expetedfeMaleUser = new ArrayList<String>();
		//ArrayList<Boolean>al = new ArrayList<Boolean>();
		
	for(int i=0;i<uNames.size();i++) {
			String UserName= uNames.get(i).getText();// i=0--kiran...1=sagar..2=monica...3=kimaya..for perticular i it is giving usernamee
			String Gender= gender.get(i).getText(); // for perticular i it is giving gender
			if(Gender.equals("Male")) {  // checking condition for male ...if male presen add that male name in acpted user
				
				 System.out.println("Male user is " +  UserName);
				 accptedtedUser.add(UserName);
			}else {
				 System.out.println("FeMale user is " +  UserName);
				 accptedtedFemaleUser.add(UserName);
			}
			
			
		}
		//System.out.println("actaul list of"+accptedtedUser);
		//System.out.println("actaul list of"+accptedtedFemaleUser);
		
	
		String maleName = null;
		String FemaleName = null;
	for(int i=1;i<5;i++) {
			
			String data = getCellData(i, 5);//1,5----male,,,,,2,5--male....3,5 female
			if(data.equals("Male")) {
				maleName= getCellData(i, 1);//--- kiran,sagar,monica
		
			expetedUser.add(maleName);
		}else {
			FemaleName= getCellData(i, 1);
			expetedfeMaleUser.add(FemaleName);
		}
		
		
		
	
	
	}
	//Assert.assertEquals(accptedtedUser, expetedUser);
	Assert.assertEquals(accptedtedFemaleUser, expetedfeMaleUser);
	//System.out.println(expetedUser);
	System.out.println("expected female user"+expetedfeMaleUser);
	System.out.println("actual  female user"+accptedtedFemaleUser);
	}}
	


