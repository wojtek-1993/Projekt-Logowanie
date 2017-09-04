package webapp;

// Stworzenie klasy UserAccount, która symuluje tabelê w bazie danych
public class UserAccount {
	
	 public static final String GENDER_MALE ="M";
	   public static final String GENDER_FEMALE = "F";
	    
	   private String userName;
	   private String gender;
	   private String password;
	   private String U_Nazwa_Uzytkownika;
	   private String P_Haslo;
	   private String U_Imie;
	   private String U_Nazwisko;
	   private String U_Email;
	    
	 
	   public UserAccount() {
	        
	   }
	    
	   public String getUserName() {
	       return userName;
	   }
	 
	   public void setUserName(String userName) {
	       this.userName = userName;
	   }
	 
	   public String getGender() {
	       return gender;
	   }
	 
	   public void setGender(String gender) {
	       this.gender = gender;
	   }
	 
	   public String getPassword() {
	       return password;
	   }
	 
	   public void setPassword(String password) {
	       this.password = password;
	   }
	   
	   public String getU_Nazwa_Uzytkownika() {
	       return U_Nazwa_Uzytkownika;
	   }
	 
	   public void setU_Nazwa_Uzytkownika(String U_Nazwa_Uzytkownika) {
	       this.U_Nazwa_Uzytkownika = U_Nazwa_Uzytkownika;
	   }
	   
	   public String getP_Haslo() {
	       return P_Haslo;
	   }
	 
	   public void setP_Haslo(String P_Haslo) {
	       this.P_Haslo = P_Haslo;
	   }
	   
	   public String getU_Imie() {
	       return U_Imie;
	   }
	 
	   public void setFname(String U_Imie) {
	       this.U_Imie = U_Imie;
	   }
	   
	   public String getU_Nazwisko() {
	       return U_Nazwisko;
	   }
	 
	   public void setLname(String U_Nazwisko) {
	       this.U_Nazwisko = U_Nazwisko;
	   }
	   
	   public String getU_Email() {
	       return U_Email;
	   }
	 
	   public void setEmail(String U_Email) {
	       this.U_Email = U_Email;
	   }

}
