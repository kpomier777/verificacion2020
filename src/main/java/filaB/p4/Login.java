package filaB.p4;

public class Login {
    Util2 util2= new Util2();
    Util util= new Util();

    public Login(Util mockService1, Util2 mockService2){
        this.util2=mockService2;
        this.util=mockService1;
    }


    String message;
    public String roleUser(String user, String pwd){
        if (util2.isUserValid(user,pwd)){
            message="PERMISSION ROLE "+ util.getPermision(user,pwd);
        }else{
            message="Incorrect USER and PWD";
        }

        return message;
    }
}
