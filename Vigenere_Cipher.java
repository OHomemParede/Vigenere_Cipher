package deprojects;
import javax.swing.JOptionPane;
public class Vigenere_Maluko 
{
    public static void main(String[] args)
    {
      

	

	class Senha 
	{
	String conteudo2;
	int letras2;
	}
	class Mensagem
	{
	String conteudo;
	int letras;
	Senha novaTambem= new Senha();
        }


        
	

	int menu=Integer.parseInt(JOptionPane.showInputDialog("Cifra de Vigenere \n 1. Criptografar \n 2.Descriptografar"));
	if(menu==1){
            Mensagem nova =new Mensagem();
            nova.conteudo=JOptionPane.showInputDialog("digite o conteudo de sua mensagem");
	    nova.conteudo=nova.conteudo.toLowerCase();	
            nova.novaTambem.conteudo2=JOptionPane.showInputDialog("digite a sua senha");
	    nova.novaTambem.conteudo2=nova.novaTambem.conteudo2.toLowerCase();	
            nova.letras=nova.conteudo.length();
            nova.novaTambem.letras2=nova.novaTambem.conteudo2.length();
            String trab="";
	    if(nova.letras<=nova.novaTambem.letras2)
            {	
                char resulFinal='c';
	        int vari2=0;
                int x = nova.letras -1;
	        int y = nova.novaTambem.letras2-1; 
                int i2=0;
                for(int i=0; x>=i & y>=i2; i++){
                    
                int vari=0; //****deixar a vari aki****
                
                //esse for tem q repetir até q o numero de letras seja igual ao numero de msg lidos;	
	    		
                // atribuindo o valor para a mensagem;
                char msg = nova.conteudo.charAt(i); 
	    			    		
	   	if(msg=='a'){vari=1;}else if(msg=='b'){vari=2;}else if(msg=='c'){vari=3;}
                else if(msg=='d'){vari=4;}else if(msg=='e'){vari=5;}else if(msg=='f'){vari=6;}
	   	else if(msg=='g'){vari=7;}else if(msg=='h'){vari=8;}else if(msg=='i'){vari=9;}	
	  	else if(msg=='j'){vari=10;}else if(msg=='k'){vari=11;}else if(msg=='l'){vari=12;}
	   	else if(msg=='m'){vari=13;}else if(msg=='n'){vari=14;}else if(msg=='o'){vari=15;}
                else if(msg=='p'){vari=16;}else if(msg=='q'){vari=17;}else if(msg=='r'){vari=18;}
                else if(msg=='s'){vari=19;}else if(msg=='t'){vari=20;}else if(msg=='u'){vari=21;}
                else if(msg=='v'){vari=22;}else if(msg=='w'){vari=23;}else if(msg=='x'){vari=24;}
                else if(msg=='y'){vari=25;}else if(msg=='z'){vari=26;}
                
                if(vari==0){
                    resulFinal = nova.conteudo.charAt(i);
                    
                }
                else{
                    //atribuindo o valor para a senha;
                    char msg2 = nova.novaTambem.conteudo2.charAt(i2);
	    	
                    if(msg2=='a'){vari2=1;}else if(msg2=='b'){vari2=2;}else if(msg2=='c'){vari2=3;}
                    else if(msg2=='d'){vari2=4;}else if(msg2=='e'){vari2=5;}else if(msg2=='f'){vari2=6;}
                    else if(msg2=='g'){vari2=7;}else if(msg2=='h'){vari2=8;}else if(msg2=='i'){vari2=9;}	
                    else if(msg2=='j'){vari2=10;}else if(msg2=='k'){vari2=11;}else if(msg2=='l'){vari2=12;}
                    else if(msg2=='m'){vari2=13;}else if(msg2=='n'){vari2=14;}else if(msg2=='o'){vari2=15;}
                    else if(msg2=='p'){vari2=16;}else if(msg2=='q'){vari2=17;}else if(msg2=='r'){vari2=18;}
                    else if(msg2=='s'){vari2=19;}else if(msg2=='t'){vari2=20;}else if(msg2=='u'){vari2=21;}
                    else if(msg2=='v'){vari2=22;}else if(msg2=='w'){vari2=23;}else if(msg2=='x'){vari2=24;}
                    else if(msg2=='y'){vari2=25;}else if(msg2=='z'){vari2=26;}             
    	
                    int resultado= ((vari+vari2-1)%26);
	    		
                    if(resultado==1){resulFinal='a';}else if(resultado==2){resulFinal='b';}else if(resultado==3){resulFinal='c';}    			
                    else if(resultado==4){resulFinal='d';}else if(resultado==5){resulFinal='e';}else if(resultado==6){resulFinal='f';}
                    else if(resultado==7){resulFinal='g';}else if(resultado==8){resulFinal='h';}else if(resultado==9){resulFinal='i';}
                    else if(resultado==10){resulFinal='j';}else if(resultado==11){resulFinal='k';}else if(resultado==12){resulFinal='l';}
                    else if(resultado==13){resulFinal='m';}else if(resultado==14){resulFinal='n';}else if(resultado==15){resulFinal='o';}
                    else if(resultado==16){resulFinal='p';}else if(resultado==17){resulFinal='q';}else if(resultado==18){resulFinal='r';} 
                    else if(resultado==19){resulFinal='s';}else if(resultado==20){resulFinal='t';}else if(resultado==21){resulFinal='u';}
                    else if(resultado==22){resulFinal='v';}else if(resultado==23){resulFinal='w';}else if(resultado==24){resulFinal='x';}
                    else if(resultado==25){resulFinal='y';}else if(resultado==0){resulFinal='z';}
                    
                    i2++;
                }
                
                trab += resulFinal;

	    	}//aqui termina o for de condição dupla;
	    	JOptionPane.showMessageDialog(null,"A sua mensagem criptografada: \n"+trab);
	    }

            else //mensagem.len > senha.len     
	    {
	    	while (nova.letras>nova.novaTambem.letras2){
                    nova.novaTambem.conteudo2+=nova.novaTambem.conteudo2;
                    nova.novaTambem.letras2 = nova.novaTambem.letras2 + nova.novaTambem.letras2 ; 
	    	}
	    	//aqui a gente faz o qo programa tem q fazer;
	    	char resulFinal='c';
	        int vari2=0;
	        int x = nova.letras -1;
	        int y = nova.novaTambem.letras2-1;
    		int i2=0;
	    	for(int i=0; x>=i & y>=i2; i++){
                    
                int vari=0; //****deixar a vari aki****
                
	    	//esse for tem q repetir até q o numero de letras seja igual ao numero de msg lidos;	
	    		
	    	// atribuindo o valor para a mensagem;
                char msg = nova.conteudo.charAt(i); 
	    			    		
	   	if(msg=='a'){vari=1;}else if(msg=='b'){vari=2;}else if(msg=='c'){vari=3;}
                else if(msg=='d'){vari=4;}else if(msg=='e'){vari=5;}else if(msg=='f'){vari=6;}
	   	else if(msg=='g'){vari=7;}else if(msg=='h'){vari=8;}else if(msg=='i'){vari=9;}	
	  	else if(msg=='j'){vari=10;}else if(msg=='k'){vari=11;}else if(msg=='l'){vari=12;}
	   	else if(msg=='m'){vari=13;}else if(msg=='n'){vari=14;}else if(msg=='o'){vari=15;}
                else if(msg=='p'){vari=16;}else if(msg=='q'){vari=17;}else if(msg=='r'){vari=18;}
                else if(msg=='s'){vari=19;}else if(msg=='t'){vari=20;}else if(msg=='u'){vari=21;}
                else if(msg=='v'){vari=22;}else if(msg=='w'){vari=23;}else if(msg=='x'){vari=24;}
                else if(msg=='y'){vari=25;}else if(msg=='z'){vari=26;}
                
                if(vari==0){
                    resulFinal = nova.conteudo.charAt(i);
                    
                }
                else{
                
                    //atribuindo o valor para a senha;
                    char msg2 = nova.novaTambem.conteudo2.charAt(i2);
	    	
                    if(msg2=='a'){vari2=1;}else if(msg2=='b'){vari2=2;}else if(msg2=='c'){vari2=3;}
                    else if(msg2=='d'){vari2=4;}else if(msg2=='e'){vari2=5;}else if(msg2=='f'){vari2=6;}
                    else if(msg2=='g'){vari2=7;}else if(msg2=='h'){vari2=8;}else if(msg2=='i'){vari2=9;}	
                    else if(msg2=='j'){vari2=10;}else if(msg2=='k'){vari2=11;}else if(msg2=='l'){vari2=12;}
                    else if(msg2=='m'){vari2=13;}else if(msg2=='n'){vari2=14;}else if(msg2=='o'){vari2=15;}
                    else if(msg2=='p'){vari2=16;}else if(msg2=='q'){vari2=17;}else if(msg2=='r'){vari2=18;}
                    else if(msg2=='s'){vari2=19;}else if(msg2=='t'){vari2=20;}else if(msg2=='u'){vari2=21;}
                    else if(msg2=='v'){vari2=22;}else if(msg2=='w'){vari2=23;}else if(msg2=='x'){vari2=24;}
                    else if(msg2=='y'){vari2=25;}else if(msg2=='z'){vari2=26;}             

                    int resultado= ((vari+vari2-1)%26);

                    if(resultado==1){resulFinal='a';}else if(resultado==2){resulFinal='b';}else if(resultado==3){resulFinal='c';}    			
                    else if(resultado==4){resulFinal='d';}else if(resultado==5){resulFinal='e';}else if(resultado==6){resulFinal='f';}
                    else if(resultado==7){resulFinal='g';}else if(resultado==8){resulFinal='h';}else if(resultado==9){resulFinal='i';}
                    else if(resultado==10){resulFinal='j';}else if(resultado==11){resulFinal='k';}else if(resultado==12){resulFinal='l';}
                    else if(resultado==13){resulFinal='m';}else if(resultado==14){resulFinal='n';}else if(resultado==15){resulFinal='o';}
                    else if(resultado==16){resulFinal='p';}else if(resultado==17){resulFinal='q';}else if(resultado==18){resulFinal='r';} 
                    else if(resultado==19){resulFinal='s';}else if(resultado==20){resulFinal='t';}else if(resultado==21){resulFinal='u';}
                    else if(resultado==22){resulFinal='v';}else if(resultado==23){resulFinal='w';}else if(resultado==24){resulFinal='x';}
                    else if(resultado==25){resulFinal='y';}else if(resultado==0){resulFinal='z';}
                    
                    i2++;
                }    
                
                trab += resulFinal;
	    		
	    	}//aqui termina o for de condição dupla;
	    	JOptionPane.showMessageDialog(null,"A sua mensagem criptografada: \n"+trab);
	
	    }
	}//o if do menu para criptografar;
	else if(menu==2){
            Mensagem nova =new Mensagem();
            nova.conteudo=JOptionPane.showInputDialog("Digite a mensagem criptografada");
	    nova.conteudo=nova.conteudo.toLowerCase();	
            nova.novaTambem .conteudo2=JOptionPane.showInputDialog("Digite a senha");
	    nova.novaTambem.conteudo2=nova.novaTambem.conteudo2.toLowerCase();	
            nova.letras=nova.conteudo.length();
            nova.novaTambem.letras2=nova.novaTambem.conteudo2.length();
            String trab="";
            if(nova.letras<=nova.novaTambem.letras2)
	    {
                char resulFinal='c';
	        int vari2=0;
	        int x = nova.letras -1;
	        int y = nova.novaTambem.letras2-1; 
                int i2=0;
	    	for(int i=0; x>=i & y>=i2; i++){
                    
                int vari=0; //****deixar a vari aki****
                    
	    	//esse for tem q repetir até q o numero de letras seja igual ao numero de msg lidos;	
	    		
	    	// atribuindo o valor para a mensagem;
	    	char msg = nova.conteudo.charAt(i);
                
	   	if(msg=='a'){vari=1;}else if(msg=='b'){vari=2;}else if(msg=='c'){vari=3;}
                else if(msg=='d'){vari=4;}else if(msg=='e'){vari=5;}else if(msg=='f'){vari=6;}
	   	else if(msg=='g'){vari=7;}else if(msg=='h'){vari=8;}else if(msg=='i'){vari=9;}	
	  	else if(msg=='j'){vari=10;}else if(msg=='k'){vari=11;}else if(msg=='l'){vari=12;}
	   	else if(msg=='m'){vari=13;}else if(msg=='n'){vari=14;}else if(msg=='o'){vari=15;}
                else if(msg=='p'){vari=16;}else if(msg=='q'){vari=17;}else if(msg=='r'){vari=18;}
                else if(msg=='s'){vari=19;}else if(msg=='t'){vari=20;}else if(msg=='u'){vari=21;}
                else if(msg=='v'){vari=22;}else if(msg=='w'){vari=23;}else if(msg=='x'){vari=24;}
                else if(msg=='y'){vari=25;}else if(msg=='z'){vari=26;}
                
                if(vari==0){
                    resulFinal = nova.conteudo.charAt(i);
                    
                }
                else{
                
                    //atribuindo o valor para a senha;
                    char msg2 = nova.novaTambem.conteudo2.charAt(i2);
	   		
                    if(msg2=='a'){vari2=1;}else if(msg2=='b'){vari2=2;}else if(msg2=='c'){vari2=3;}
                    else if(msg2=='d'){vari2=4;}else if(msg2=='e'){vari2=5;}else if(msg2=='f'){vari2=6;}
                    else if(msg2=='g'){vari2=7;}else if(msg2=='h'){vari2=8;}else if(msg2=='i'){vari2=9;}	
                    else if(msg2=='j'){vari2=10;}else if(msg2=='k'){vari2=11;}else if(msg2=='l'){vari2=12;}
                    else if(msg2=='m'){vari2=13;}else if(msg2=='n'){vari2=14;}else if(msg2=='o'){vari2=15;}
                    else if(msg2=='p'){vari2=16;}else if(msg2=='q'){vari2=17;}else if(msg2=='r'){vari2=18;}
                    else if(msg2=='s'){vari2=19;}else if(msg2=='t'){vari2=20;}else if(msg2=='u'){vari2=21;}
                    else if(msg2=='v'){vari2=22;}else if(msg2=='w'){vari2=23;}else if(msg2=='x'){vari2=24;}
                    else if(msg2=='y'){vari2=25;}else if(msg2=='z'){vari2=26;}
                    
                    vari= vari+26;
                    int resultado= ((vari-vari2+1)%26);
	    		
                    if(resultado==1){resulFinal='a';}else if(resultado==2){resulFinal='b';}else if(resultado==3){resulFinal='c';}    			
                    else if(resultado==4){resulFinal='d';}else if(resultado==5){resulFinal='e';}else if(resultado==6){resulFinal='f';}
                    else if(resultado==7){resulFinal='g';}else if(resultado==8){resulFinal='h';}else if(resultado==9){resulFinal='i';}
                    else if(resultado==10){resulFinal='j';}else if(resultado==11){resulFinal='k';}else if(resultado==12){resulFinal='l';}
                    else if(resultado==13){resulFinal='m';}else if(resultado==14){resulFinal='n';}else if(resultado==15){resulFinal='o';}
                    else if(resultado==16){resulFinal='p';}else if(resultado==17){resulFinal='q';}else if(resultado==18){resulFinal='r';} 
                    else if(resultado==19){resulFinal='s';}else if(resultado==20){resulFinal='t';}else if(resultado==21){resulFinal='u';}
                    else if(resultado==22){resulFinal='v';}else if(resultado==23){resulFinal='w';}else if(resultado==24){resulFinal='x';}
                    else if(resultado==25){resulFinal='y';}else if(resultado==26){resulFinal='z';}
                    
                    i2++;
                }	
                
	    	trab += resulFinal;
	    
                }//aqui termina o for de condição dupla;
	    	JOptionPane.showMessageDialog(null,"A sua mensagem descriptografada: \n"+trab);
                
	    }
            else //mensagem.len > senha.len     
	    {
	    	while (nova.letras>nova.novaTambem.letras2){
                    nova.novaTambem.conteudo2+=nova.novaTambem.conteudo2;
                    nova.novaTambem.letras2 = nova.novaTambem.letras2 + nova.novaTambem.letras2 ; 
	    	}
            char resulFinal='c';
            int vari2=0;
            int x = nova.letras -1;
            int y = nova.novaTambem.letras2-1; 
            int i2=0;
            for(int i=0; x>=i & y>=i2; i++){
                
            int vari=0; //****deixar a vari aki****
                
            //esse for tem q repetir até q o numero de letras seja igual ao numero de msg lidos;	

            // atribuindo o valor para a mensagem;
            char msg = nova.conteudo.charAt(i);
                
            if(msg=='a'){vari=1;}else if(msg=='b'){vari=2;}else if(msg=='c'){vari=3;}
            else if(msg=='d'){vari=4;}else if(msg=='e'){vari=5;}else if(msg=='f'){vari=6;}
            else if(msg=='g'){vari=7;}else if(msg=='h'){vari=8;}else if(msg=='i'){vari=9;}	
            else if(msg=='j'){vari=10;}else if(msg=='k'){vari=11;}else if(msg=='l'){vari=12;}
            else if(msg=='m'){vari=13;}else if(msg=='n'){vari=14;}else if(msg=='o'){vari=15;}
            else if(msg=='p'){vari=16;}else if(msg=='q'){vari=17;}else if(msg=='r'){vari=18;}
            else if(msg=='s'){vari=19;}else if(msg=='t'){vari=20;}else if(msg=='u'){vari=21;}
            else if(msg=='v'){vari=22;}else if(msg=='w'){vari=23;}else if(msg=='x'){vari=24;}
            else if(msg=='y'){vari=25;}else if(msg=='z'){vari=26;}
    	
            if(vari==0){
                resulFinal = nova.conteudo.charAt(i);
                    
            }
            else{
                
    		//atribuindo o valor para a senha;
    		char msg2 = nova.novaTambem.conteudo2.charAt(i2);
    		
                if(msg2=='a'){vari2=1;}else if(msg2=='b'){vari2=2;}else if(msg2=='c'){vari2=3;}
                else if(msg2=='d'){vari2=4;}else if(msg2=='e'){vari2=5;}else if(msg2=='f'){vari2=6;}
	   	else if(msg2=='g'){vari2=7;}else if(msg2=='h'){vari2=8;}else if(msg2=='i'){vari2=9;}	
	  	else if(msg2=='j'){vari2=10;}else if(msg2=='k'){vari2=11;}else if(msg2=='l'){vari2=12;}
	   	else if(msg2=='m'){vari2=13;}else if(msg2=='n'){vari2=14;}else if(msg2=='o'){vari2=15;}
                else if(msg2=='p'){vari2=16;}else if(msg2=='q'){vari2=17;}else if(msg2=='r'){vari2=18;}
                else if(msg2=='s'){vari2=19;}else if(msg2=='t'){vari2=20;}else if(msg2=='u'){vari2=21;}
                else if(msg2=='v'){vari2=22;}else if(msg2=='w'){vari2=23;}else if(msg2=='x'){vari2=24;}
                else if(msg2=='y'){vari2=25;}else if(msg2=='z'){vari2=26;}

    		vari= vari+26;
	    	int resultado= ((vari-vari2+1)%26);
	    		
	    	if(resultado==1){resulFinal='a';}else if(resultado==2){resulFinal='b';}else if(resultado==3){resulFinal='c';}    			
                else if(resultado==4){resulFinal='d';}else if(resultado==5){resulFinal='e';}else if(resultado==6){resulFinal='f';}
                else if(resultado==7){resulFinal='g';}else if(resultado==8){resulFinal='h';}else if(resultado==9){resulFinal='i';}
	    	else if(resultado==10){resulFinal='j';}else if(resultado==11){resulFinal='k';}else if(resultado==12){resulFinal='l';}
	    	else if(resultado==13){resulFinal='m';}else if(resultado==14){resulFinal='n';}else if(resultado==15){resulFinal='o';}
                else if(resultado==16){resulFinal='p';}else if(resultado==17){resulFinal='q';}else if(resultado==18){resulFinal='r';} 
	    	else if(resultado==19){resulFinal='s';}else if(resultado==20){resulFinal='t';}else if(resultado==21){resulFinal='u';}
	    	else if(resultado==22){resulFinal='v';}else if(resultado==23){resulFinal='w';}else if(resultado==24){resulFinal='x';}
                else if(resultado==25){resulFinal='y';}else if(resultado==26){resulFinal='z';}
                
                i2++;
            }	
            
	    trab += resulFinal;
	    	
	    }//aqui termina o for de condição dupla;
	    JOptionPane.showMessageDialog(null,"A sua mensagem descriptografada: \n"+trab);	
	    }
	}
	else
            {
            JOptionPane.showMessageDialog(null,"Digite um valor válido");
            }
    }
 
}
