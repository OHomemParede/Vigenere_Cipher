#include <stdio.h>
#include <string.h>
#define alpha "abcdefghijklmnopqrstuvwxyz"//definindo o alphabeto de referencia;
void crip(char *msg, char *pwd, char *cmsg);//criptografa a mensagem;
void desc(char *msg, char *pwd, char *cmsg);//descriptografa a mensagem;
int find(char *x, char y);//acha o index do elemento em uma string, retorna -1 caso nao ache;

int find(char *x, char y){
  int index;
  for(index=0;index<strlen(&x[0]);index++){
  	if(x[index] == y){
      return index;
	}
  }
  return -1;
}

void crip(char *msg, char *pwd, char *cmsg){
  
}
int main(void) {
  int a;//contadores
  int user;//variaveis de selecao
  char msg[300], pwd[300], cmsg[300];//vetores de mensagem e senha (STRING);
  for(a=0;a<300;a++){msg[a]=0;pwd[a]=0;cmsg[a]=0;}//zerando os valores aleatorios dos vetores;
  
  do{
    printf("(1)Criptografar (2)Descriptografar");scanf("%d", &user);//escolhendo o caminho;
  }while(user != 1 || user != 2)
  scanf("%s", &msg[0]);scanf("%s", &pwd[0]);//recebendo mensagem e senha;
  
  if(user==1){
    crip(msg, pwd);	
  }
  else{
  	desc(msg, pwd);
  }
  return 0;
}
