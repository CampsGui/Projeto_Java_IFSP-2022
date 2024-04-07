#define ldr 12

// Constantes que definem os pinos led
const int ledPin =  13;      // the number of the LED pin

// Variáveis que mudan o valor durante o processamento
char dado; //variável que receberá os dados da porta serial
bool valorldr;  //armazena o valor lido pela porta analógica

void setup() {
  //Indica frequencia da prota serial
  Serial.begin(9600);//frequência da porta serial
  // indica LED (pino 13) como saida
  pinMode(ldr, INPUT);
  pinMode(ledPin, OUTPUT);
}

void loop() {
 //Recebe dados da Porta Serial conectada ao computador
 if(Serial.available() > 0){ //verifica se existe comunicação com a porta serial
  dado = Serial.read();
  if(dado == '1')
  {    
      valorldr = digitalRead(ldr);
      Serial.println(valorldr);
      if(valorldr == '1')
           digitalWrite(ledPin,HIGH); //liga o pino ledPin
           Serial.println("Acesa"); 
       else
           if(valorldr == '0')
              digitalWrite(ledPin,LOW); //desliga o pino ledPin
              Serial.println("Apagada");
  }
  }
}   