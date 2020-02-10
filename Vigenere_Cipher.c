#include <stdio.h>
#include <string.h>
#define alpha "abcdefghijklmnopqrstuvwxyz"//definindo o alphabeto de referencia;
void crip(char *msg, char *pwd, char *cmsg);//criptografa a mensagem;
void desc(char *msg, char *pwd, char *cmsg);//descriptografa a mensagem;
int find_alpha(char x);//acha o index do elemento em alpha, retorna -1 caso nao ache;

int find_alpha(char x){
  int index;
  for(index=0;index<26;index++){
  	if(alpha[index] == x){
      return index;
	}
  }
  return -1;
}

void crip(char *msg, char *pwd, char *cmsg){
  int a;
  for(a=0;a<strlen(&pwd[0]);a++){
  	if(a==strlen(&pwd[0])){break;}
  *&cmsg[a] = alpha[(find_alpha(*&msg[a])+find_alpha(*&pwd[a]))%26];
  }
}

void desc(char *msg, char *pwd, char *cmsg){
  int a;
  for(a=0;a<strlen(&pwd[0]);a++){
  	if(a==strlen(&pwd[0])){break;}
  *&cmsg[a] = alpha[(find_alpha(*&msg[a])-find_alpha(*&pwd[a]))%26];
  }
}

int main(void) {
  int a;//contadores
  int user;//variaveis de selecao
  char msg[300], pwd[300], cmsg[300];//vetores de mensagem e senha (STRING);
  for(a=0;a<300;a++){msg[a]=0;pwd[a]=0;cmsg[a]=0;}//zerando os valores aleatorios dos vetores;
  
  do{
    printf("(1)Criptografar (2)Descriptografar\n");scanf("%d", &user);//escolhendo o caminho;
  }while(user != 1 && user != 2);
  
  printf("msg e pwd:\n");
  scanf("%s", &msg[0]);scanf("%s", &pwd[0]);//recebendo mensagem e senha;
  
  //______________________________
  a=0;
  while(strlen(msg)>strlen(pwd)){ // Verificacao: a senha deve ser >= que a mensagem
  	pwd[strlen(pwd)] = pwd[a];
	a++;
  }
  //______________________________
  
  if(user==1){
    crip(&msg[0], &pwd[0], &cmsg[0]);
    printf("%s\n",cmsg);
  }
  else{
  	desc(&msg[0], &pwd[0], &cmsg[0]);
    printf("%s\n",cmsg);
  }
  return 0;
}
