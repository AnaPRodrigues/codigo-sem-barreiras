package projetoempresadecartaodebeneficios;

import java.time.LocalDate;

public enum TiposDeCartaoDeBeneficio {

    VA {
        @Override
        public InterfaceCartaoDeBeneficio fabricar() {
            return new ValeAlimentacao();
        }
    },
    VR {
        @Override
        public InterfaceCartaoDeBeneficio fabricar() {
            return new ValeRefeicao();
        }
    },
    VC {
        @Override
        public InterfaceCartaoDeBeneficio fabricar() {
            return new ValeCombustivel();
        }
    };

    abstract InterfaceCartaoDeBeneficio fabricar();

}
