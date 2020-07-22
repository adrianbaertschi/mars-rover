package marsrover;

public enum Direction {

    N {
        @Override
        public Direction leftOf() {
            return W;
        }

        @Override
        public Direction rightOf() {
            return E;
        }
    },
    E {
        @Override
        public Direction leftOf() {
            return N;
        }

        @Override
        public Direction rightOf() {
            return S;
        }
    },
    S {
        @Override
        public Direction leftOf() {
            return E;
        }

        @Override
        public Direction rightOf() {
            return W;
        }
    },
    W {
        @Override
        public Direction leftOf() {
            return S;
        }

        @Override
        public Direction rightOf() {
            return N;
        }
    };

    public abstract Direction leftOf();

    public abstract Direction rightOf();
}
