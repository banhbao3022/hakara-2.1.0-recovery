package p623k1;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: k1.s, reason: use source file name */
/* JADX INFO: compiled from: ParameterHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public class ParameterHandler<T> extends ParameterHandler3<Iterable<T>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ParameterHandler3 f33196a;

    public ParameterHandler(ParameterHandler3 parameterHandler3) {
        this.f33196a = parameterHandler3;
    }

    @Override // p623k1.ParameterHandler3
    /* JADX INFO: renamed from: a */
    public void mo14305a(RequestBuilder2 requestBuilder2, Object obj) throws IOException {
        Iterable iterable = (Iterable) obj;
        if (iterable == null) {
            return;
        }
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            this.f33196a.mo14305a(requestBuilder2, it.next());
        }
    }
}
