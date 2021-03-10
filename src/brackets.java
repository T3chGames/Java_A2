class brackets {
        static Integer brackets(String formule) {
                //hier zoekt hij de haakjes paaren bij mekaar.
            if (formule.matches(".*\\(.+\\).*")) {
                final int begin = formule.lastIndexOf('(');
                final int end = formule.indexOf(')', begin);
                return brackets(formule.substring(begin + 1, end));
            }
            return 0;
        }
    }

