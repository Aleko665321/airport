public class Terminal {

        private int terminalNumber;
        private String gate1;
        private String gate2;
        private String gate3;

        // Constructor
        public Terminal(int terminalNumber, String gate1, String gate2, String gate3) {
            this.terminalNumber = terminalNumber;
            this.gate1 = gate1;
            this.gate2 = gate2;
            this.gate3 = gate3;
        }

        // Getters and Setters
        public int getTerminalNumber() {
            return terminalNumber;
        }

        public void setTerminalNumber(int terminalNumber) {
            this.terminalNumber = terminalNumber;
        }

        public String getGate1() {
            return gate1;
        }

        public void setGate1(String gate1) {
            this.gate1 = gate1;
        }

        public String getGate2() {
            return gate2;
        }

        public void setGate2(String gate2) {
            this.gate2 = gate2;
        }

        public String getGate3() {
            return gate3;
        }

        public void setGate3(String gate3) {
            this.gate3 = gate3;
        }

    }

