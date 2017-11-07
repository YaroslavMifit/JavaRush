package com.javarush.task.task24.task2405;

/* 
Black box
*/
public class Solution implements Action {
    public static int countActionObjects;

    private int param;

    private Action solutionAction = new Action() {

        //!!!!! Changes can be here
        //!!!!! Изменения могут быть тут
        public void someAction() {
            new Action(){
                public void someAction(){
                    if (param>0)
                    {
                        for (int i=5; i>0; i--) System.out.println("* "+i);
                        System.out.print("* ");
                        new FirstClass()
                        {
                            public Action getDependantAction()
                            {
                                return null;
                            }
                        }.someAction();
                        param=0;
                        System.out.print("* ");
                        new SecondClass().someAction();
                        System.out.println("* "+SecondClass.SPECIFIC_ACTION_FOR_ANONYMOUS_SECOND_CLASS_PARAM.substring(1)+param);
                    }
                    else
                    {
                        System.out.print("* ");
                        new SecondClass().someAction();
                        System.out.println("* "+SecondClass.SPECIFIC_ACTION_FOR_ANONYMOUS_SECOND_CLASS_PARAM.substring(1)+param);
                    }
                    System.out.println("* ");
                }
            }.someAction();
            //!!!!! All changes have to be here
            //!!!!! Все изменения должны быть только тут
        }
    };


    public Solution(int param) {
        this.param = param;
    }

    @Override
    public void someAction() {
        solutionAction.someAction();
    }

    /**
     * 5
     * 4
     * 3
     * 2
     * 1
     * class FirstClass, method someAction
     * class SecondClass, method someAction
     * Specific action for anonymous SecondClass, param = 0
     * Count of created Action objects is 2
     * class SecondClass, method someAction
     * Specific action for anonymous SecondClass, param = -1
     * Count of created Action objects is 3
     */
    public static void main(String[] args) {
        Solution solution = new Solution(5);
        solution.someAction();
        System.out.println("Count of created Action objects is " + countActionObjects);

        solution = new Solution(-1);
        solution.someAction();
        System.out.println("Count of created Action objects is " + countActionObjects);
    }
}
