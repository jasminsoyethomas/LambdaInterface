public class Student extends Person {

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }


    public void saveStudent(Student student){
        SaveHandler saveHandler = new SaveHandler() {
            @Override
            public void saveObject(Object object) {
                System.out.println("Object saved!");
            }
        };
        saveHandler.saveObject(this);
    }

    public void multiThreadSave(String directoryLocation){
        Thread t1;
        Thread t2;
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("I'm Runnable" + directoryLocation);
                }
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("I'm Runnable 2" + directoryLocation);
                }
            }
        };

        t1 = new Thread(runnable);
        t2 = new Thread(runnable2);
        t1.start();
        t2.start();
        }
    }

