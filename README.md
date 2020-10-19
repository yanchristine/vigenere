# Vigenere Encoder/Decoder
Cybersecurity Fall 2020 Vigenere Cipher

Write a decoder:
Something like this + an extra method or two would be sensible)
String vigenere(String text, String key, Boolean encode){}

Since this is a symmetric key and the operation is just a shift  you only need one function to encode and decode, but a boolean can tell your function if it is a + or - shift.


Your repo should have a makefile such that:
make run ARGS="encode plaintext key"    
make run ARGS="decode ciphertext key"    
