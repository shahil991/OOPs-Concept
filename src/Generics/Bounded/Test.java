package Generics.Bounded;

public class Test <T extends Car>{

        // Car Type
        private T data;

        public void setData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }
    }

