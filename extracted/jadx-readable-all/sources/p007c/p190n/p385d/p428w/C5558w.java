package p007c.p190n.p385d.p428w;

import java.util.Locale;

/* JADX INFO: renamed from: c.n.d.w.w */
/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5558w extends Exception {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C5558w(String str) {
        super(str);
        if (str == null) {
            return;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        switch (lowerCase.hashCode()) {
            case -1743242157:
                if (lowerCase.equals("service_not_available")) {
                    return;
                }
                break;
            case -1290953729:
                if (lowerCase.equals("toomanymessages")) {
                    return;
                }
                break;
            case -920906446:
                if (lowerCase.equals("invalid_parameters")) {
                    return;
                }
                break;
            case -617027085:
                if (lowerCase.equals("messagetoobig")) {
                    return;
                }
                break;
            case -95047692:
                if (lowerCase.equals("missing_to")) {
                    return;
                }
                break;
        }
    }
}
