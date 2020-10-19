run: Vigenere.class
	java Vigenere $(ARGS)

Vigenere.class: Vigenere.java
	javac Vigenere.java

clean:
	rm *.class

help:
	@echo to decode: make run ARGS='decode ciphertext key'
	@echo to encode: make run ARGS='encode plaintext key'
