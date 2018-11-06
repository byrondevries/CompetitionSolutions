CC = clang++

default: all
.PHONY: default all clean

TimeLoop.o:
	$(CC) -c ./src/TimeLoop.cpp -o ./src/TimeLoop.o

TimeLoop: TimeLoop.o
	$(CC) ./src/TimeLoop.o -o ./bin/TimeLoop

Modulo.o:
	$(CC) -c ./src/Modulo.cpp -o ./src/Modulo.o

Modulo: Modulo.o
	$(CC) ./src/Modulo.o -o ./bin/Modulo

Bishops.o:
	$(CC) -c ./src/Bishops.cpp -o ./src/Bishops.o

Bishops: Bishops.o
	$(CC) ./src/Bishops.o -o ./bin/Bishops

CombinationLock.o:
	$(CC) -c ./src/CombinationLock.cpp -o ./src/CombinationLock.o

CombinationLock: CombinationLock.o
	$(CC) ./src/CombinationLock.o -o ./bin/CombinationLock

10KindsOfPeople.o:
	$(CC) -c ./src/10KindsOfPeople.cpp -o ./src/10KindsOfPeople.o

10KindsOfPeople: 10KindsOfPeople.o
	$(CC) ./src/10KindsOfPeople.o -o ./bin/10KindsOfPeople

all: TimeLoop Modulo Bishops CombinationLock 10KindsOfPeople

clean:
	-rm -f ./src/TimeLoop.o
	-rm -f ./src/Modulo.o
	-rm -f ./src/Bishops.o
	-rm -f ./src/CombinationLock.o
	-rm -f ./src/10KindsOfPeople.o
	-rm -f ./bin/TimeLoop
	-rm -f ./bin/Modulo
	-rm -f ./bin/Bishops
	-rm -f ./bin/CombinationLock
	-rm -f ./bin/10KindsOfPeople
