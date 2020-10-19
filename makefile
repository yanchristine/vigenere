help:
	@echo To encode: make run ARGS="encode plaintext key"
	@echo To decode: make run ARGS="decode ciphertext key"

run: Vigenere.class
	java Vigenere $(ARGS)

Vigenere.class:
	javac Vigenere.java

clean:
	rm *.class
