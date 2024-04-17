import java.util.ArrayList;

    class QuickSort{
        int comparison = 0;
        int swaps=0;
        static public void Swap(ArrayList<Integer> list, int a, int b){
            int temp = list.get(a);
            list.set(a, list.get(b));
            list.set(b,temp);
        }
        public void Move(ArrayList<Integer> list,int toMove, int length){
            int temp = list.get(toMove);

            {for(int i=toMove;i<toMove+length;i++){
                list.set(i,list.get(i+1));
                swaps++;
            }
            list.set(toMove+length,temp);
            swaps++;}
        }
        public void quickSort(ArrayList<Integer> list,int startPos,int endPos){
            ArrayList<Integer> result;
            int pivot = list.get(endPos);
            int midPos = endPos;
            for(int i=startPos;i<=midPos;i++){
                comparison++;
                if(list.get(i)>pivot){
                    Move(list,i,midPos-i);
                    midPos--;
                    i--;
                }


            }
            //System.out.println(String.valueOf(startPos)+" "+String.valueOf(midPos)+" "+String.valueOf(endPos));
            if(startPos<midPos){
                quickSort(list,startPos,midPos-1);
                //System.out.println(String.valueOf(startPos)+" "+String.valueOf(endPos-1));
                }

            if(midPos<endPos){
                quickSort(list,midPos, endPos);
                //System.out.println(String.valueOf(startPos)+" "+String.valueOf(endPos+1));
                //System.out.println("test");
            }

        }
    }

