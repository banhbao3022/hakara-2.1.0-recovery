package p007c.p190n.p194b.p195a.p196i.p197f;

import android.util.SparseArray;

/* JADX INFO: renamed from: c.n.b.a.i.f.p, reason: use source file name */
/* JADX INFO: compiled from: QosTier.java */
/* JADX INFO: loaded from: classes.dex */
public enum QosTier {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: l */
    public static final SparseArray<QosTier> f5698l;

    static {
        QosTier qosTier = DEFAULT;
        QosTier qosTier2 = UNMETERED_ONLY;
        QosTier qosTier3 = UNMETERED_OR_DAILY;
        QosTier qosTier4 = FAST_IF_RADIO_AWAKE;
        QosTier qosTier5 = NEVER;
        QosTier qosTier6 = UNRECOGNIZED;
        SparseArray<QosTier> sparseArray = new SparseArray<>();
        f5698l = sparseArray;
        sparseArray.put(0, qosTier);
        sparseArray.put(1, qosTier2);
        sparseArray.put(2, qosTier3);
        sparseArray.put(3, qosTier4);
        sparseArray.put(4, qosTier5);
        sparseArray.put(-1, qosTier6);
    }

    QosTier(int i) {
    }
}
