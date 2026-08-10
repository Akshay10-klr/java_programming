package thispack;
class NewParameter{
	NewParameter(ParamterCall value){
		System.out.println("inside Newparameter "+value);
		//this==call
	}

}
class ParamterCall{

	ParamterCall(){
		
		NewParameter obj=new NewParameter(this);
		//here the obj created for Newparameter but this passed is call
		System.out.println("inside paramter call");
	}
}
public class ConstructorParamterCall {

	public static void main(String[] args) {
//we create the object of parameter call invoking the default constructor
		ParamterCall call=new ParamterCall();//this==call
	}

}
