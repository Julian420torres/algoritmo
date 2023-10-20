public class Main {
    public static void main(String[] args) {
        Animal[] animales = new Animal[4];
        
        // Crear instancias de diferentes animales
        animales[0] = new Canino("Ladrido", "Carnívora", "Doméstico", "Canis lupus familiaris");
        animales[1] = new Canino("Aullido", "Carnívora", "Bosque", "Canis lupus");
        animales[2] = new Felinos("Rugido", "Carnívora", "Pradera", "Panthera leo");
        animales[3] = new Felinos("Maullido", "Ratones", "Doméstico", "Felis silvestris catus");
        
        // Mostrar los atributos de los animales
        for (Animal animal : animales) {
            System.out.println("Nombre Científico: " + animal.getNombreCientífico());
            System.out.println("Sonido: " + animal.getSonido());
            System.out.println("Alimentos: " + animal.getAlimentos());
            System.out.println("Hábitat: " + animal.getHábitat());
            System.out.println();
        }
    }
}





