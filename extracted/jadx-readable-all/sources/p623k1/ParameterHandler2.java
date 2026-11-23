package p623k1;

import java.io.IOException;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: k1.t, reason: use source file name */
/* JADX INFO: compiled from: ParameterHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public class ParameterHandler2 extends ParameterHandler3<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ParameterHandler3 f33197a;

    public ParameterHandler2(ParameterHandler3 parameterHandler3) {
        this.f33197a = parameterHandler3;
    }

    @Override // p623k1.ParameterHandler3
    /* JADX INFO: renamed from: a */
    public void mo14305a(RequestBuilder2 requestBuilder2, Object obj) throws IOException {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f33197a.mo14305a(requestBuilder2, Array.get(obj, i));
        }
    }
}
