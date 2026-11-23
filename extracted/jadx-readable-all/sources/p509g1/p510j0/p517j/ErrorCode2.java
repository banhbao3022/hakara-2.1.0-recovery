package p509g1.p510j0.p517j;

import p477d1.p493x.p495c.DefaultConstructorMarker;

/* JADX INFO: renamed from: g1.j0.j.b, reason: use source file name */
/* JADX INFO: compiled from: ErrorCode.kt */
/* JADX INFO: loaded from: classes2.dex */
public enum ErrorCode2 {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    /* JADX INFO: Fake field, exist only in values array */
    SETTINGS_TIMEOUT(4),
    /* JADX INFO: Fake field, exist only in values array */
    STREAM_CLOSED(5),
    /* JADX INFO: Fake field, exist only in values array */
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    /* JADX INFO: Fake field, exist only in values array */
    COMPRESSION_ERROR(9),
    /* JADX INFO: Fake field, exist only in values array */
    CONNECT_ERROR(10),
    /* JADX INFO: Fake field, exist only in values array */
    ENHANCE_YOUR_CALM(11),
    /* JADX INFO: Fake field, exist only in values array */
    INADEQUATE_SECURITY(12),
    /* JADX INFO: Fake field, exist only in values array */
    HTTP_1_1_REQUIRED(13);


    /* JADX INFO: renamed from: m */
    public static final a f30336m = new a(null);

    /* JADX INFO: renamed from: n */
    public final int f30337n;

    /* JADX INFO: renamed from: g1.j0.j.b$a */
    /* JADX INFO: compiled from: ErrorCode.kt */
    public static final class a {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final ErrorCode2 m13506a(int i) {
            ErrorCode2[] errorCode2ArrValues = ErrorCode2.values();
            for (int i2 = 0; i2 < 14; i2++) {
                ErrorCode2 errorCode2 = errorCode2ArrValues[i2];
                if (errorCode2.f30337n == i) {
                    return errorCode2;
                }
            }
            return null;
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    ErrorCode2(int i) {
        this.f30337n = i;
    }
}
