while True:
  user = input('Criptografar(1) Descriptografar(2) cancelar(0):')
  if user == '0':break
  mensagem = input("sua mensagem: ").lower().replace(' ','')
  senha = input("sua senha: ").lower().replace(' ','')
  crip = ''
  alpha = 'abcdefghijklmnopqrstuvwxyz'

  while len(mensagem) > len(senha): senha+=senha # ** caso a mensagem seja maior que a senha **

  def criptografar(mensagem, senha):
    global crip
    for l in range(len(mensagem)):
      crip = crip + alpha[((alpha.find(mensagem[l]) + alpha.find(senha[l]))%26)]
    return crip

  def descriptografar(mensagem, senha):
    global crip
    for l in range(len(mensagem)):
      crip = crip + alpha[((alpha.find(mensagem[l]) - alpha.find(senha[l]))%26)]
    return crip

  if user == '1': print('Mensagem Criptografada:', criptografar(mensagem, senha))
  elif user == '2': print('Mensagem Descriptografada:', descriptografar(mensagem, senha))
