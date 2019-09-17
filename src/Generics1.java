public class Generics1 {

    public <V> void changePositions(V[] mass, int firstIndex, int secondIndex){
        if(mass.length <= 1 || firstIndex >= mass.length || secondIndex >= mass.length) throw new ArrayIndexOutOfBoundsException();
        V temp = mass[firstIndex];
        mass[firstIndex] = mass[secondIndex];
        mass[secondIndex] = temp;
    }

}
