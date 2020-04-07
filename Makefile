##
## EPITECH PROJECT, 2020
## Makefile
## File description:
## Makefile for 204implementation in java
##

JFLAGS = -g
JC = javac
DOLLAR:=$$
SRC = $(shell find src/ -name '*.java')
PARSE = $(shell find src/ -name '*.java' ! -name 'Math.java' ! -name 'DuckMass.java')

.SUFFIXES: .java .class
.java.class: $(SRC)
	$(JC) $(JFLAGS) $(SRC)
	@echo  java $(PARSE) $(DOLLAR)\* > 204ducks
	@sed  -i 's/.java//g' 204ducks
	@sed  -i 's/src\///g' 204ducks
	@sed -i '1i'"#!/bin/sh" 204ducks
	@sed -i '2i'"cd src" 204ducks

default: classes

classes: $(SRC:.java=.class)

re: fclean .java.class

clean:
	$(RM) $(shell find ./ -name '*.class')
fclean:	clean