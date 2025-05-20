public class Chickens01 {
    public static void main(String[] args) {
        egg(3, 5);
        egg(4,8);
    }   
    public static void egg(int chickenCount, int eggsPerChicken)
    {
        int totalEggs = 0; 
        for (int i = 0; i < 3; i++)
        {
            if (i == 1)
            {
                chickenCount += 1;
            }
            
            if (i == 2)
            {
                chickenCount /= 2;
            }

            totalEggs += chickenCount*eggsPerChicken;
        }
        System.out.println(totalEggs);
    }
}

