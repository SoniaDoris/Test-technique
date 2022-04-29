package star;
public class Star {

    public static void main(String[] args) {
        if (args.length >0){
        try{                                        //si l'argument est un entier
        int size=Integer.parseInt(args[0]);
        if(size<0)
            System.out.println("Usage: positive number");
        else if(size>0){
            if(size==1){                            //affiche une etoile de taille 1
                System.out.println("   *");
                System.out.println("*** ***");
                System.out.println(" *   *");
                System.out.println("*** ***");
                System.out.println("   *");
            }
            else{                                   // cette partie du code produit une etoile de taille n>1
                for(int a=0;a<3*size-1;a++)         // on positionne le sommet du cone
                    System.out.print(" ");
                System.out.println("*");           
                int x=2,y=1;
                for(int i=1;i<size;i++){            //formation du cone
                    for(int a=0;a<3*size-x;a++)         
                        System.out.print(" ");
                    System.out.print("*");
                    for(int a=0;a<y;a++)         
                        System.out.print(" ");
                    System.out.println("*");
                    x++;
                    y+=2;
                }
                for(int a=0;a<3*size-x+2;a++)       //pose de la barre horizontale a la base du cone
                    System.out.print("*");
                for(int a=0;a<y-2;a++)         
                    System.out.print(" ");
                for(int a=0;a<3*size-x+2;a++)         
                    System.out.print("*");
                System.out.println();
                for(int i=0;i<size;i++){            //formation de la partie superieure des formes ">" et "<" de l'etoile 
                    for(int a=0;a<i+1;a++)         
                        System.out.print(" ");
                    System.out.print("*");
                    for(int a=0;a<6*size-2*i-5;a++)         
                        System.out.print(" ");
                    System.out.println("*");
                }
                for(int i=size-1;i>0;i--){          // formation de la partie inferieure des formes ">" et "<" de l'etoile
                    for(int a=i;a>0;a--)         
                        System.out.print(" ");
                    System.out.print("*");
                    for(int a=6*size-2*i-3;a>0;a--)         
                        System.out.print(" ");
                    System.out.println("*");
                }
                for(int a=0;a<3*size-x+2;a++)       // replique de la barre horizontale  
                    System.out.print("*");
                for(int a=0;a<y-2;a++)         
                    System.out.print(" ");
                for(int a=0;a<3*size-x+2;a++)         
                    System.out.print("*");
                System.out.println();
                for(int i=size;i>1;i--){            // inversion du cone de l'etoile
                    for(int a=3*size-x+1;a>0;a--)         
                        System.out.print(" ");
                    System.out.print("*");
                    for(int a=y-2;a>0;a--)         
                        System.out.print(" ");
                    System.out.println("*");
                    x--;
                    y-=2;
                }
                for(int a=0;a<3*size-1;a++)        
                    System.out.print(" ");
                System.out.println("*");
            }
        }
        }catch (NumberFormatException e){                   //si l'argument n'est pas un entier
            System.out.println("Usage: enter a number");
            
        }
        }
        
    }
    
}
