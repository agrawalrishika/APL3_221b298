class Voice{
Animal[] animal =new Animal[5];
void prepareVoice(){
animal[0] =new Cow();
animal[1] = new Goat();
animal[2] = new Tiger();
animal[3] = new Lion();
animal[4] = new Pig();
}

  void hear() {
        for (Animal a : animal) {
            a.makeVoice();
        }
    }
}
