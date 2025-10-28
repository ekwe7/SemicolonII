public class ServiceDelivery{
public static void main(String[] args){
        
int[] productBonus = {160, 200, 250, 500};
int basePay = 5000;
int[] averageDelivery = {50, 60, 70};

for(int count = 0; count < productBonus.length; count++){
for(int counter = 0; counter < averageDelivery.length; counter++){

int result = basePay + (productBonus[count] * averageDelivery[counter]);


System.out.println(" Delivery: " + averageDelivery[counter] + " Total Pay: " + result);

}
}


}
}