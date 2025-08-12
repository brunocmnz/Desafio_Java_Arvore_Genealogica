package com.CE_TP;

import java.awt.image.AffineTransformOp;

public enum GrauFamiliar {
    AVO, TATARAVO;

    @Override
    public String toString() {
        switch (this) {
            case AVO:
                return "AVO";
            case TATARAVO:
                return "TATARAVO";
        }
        return null;
    }
}
