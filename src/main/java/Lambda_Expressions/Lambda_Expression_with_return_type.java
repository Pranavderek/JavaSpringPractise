package Lambda_Expressions;

@FunctionalInterface
interface Budget
{
    public int budget(int act,int exp);
}


public class Lambda_Expression_with_return_type
{
    public static void main(String[] args) {

        Budget bud = (act,exp) ->  act-exp;

        int res = bud.budget(10000,5000);
        System.out.println("Remaining Budget is:"+res);
    }

}
