package p007c.p190n.p194b.p266d.p314j.p315a;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class tf2 extends xf2 {
    public tf2(pe2 pe2Var, String str, String str2, go0 go0Var, int i, int i2) {
        super(pe2Var, "wxqoL0Ntglf/xfXLeHxTqKHQFZETSKw9Sjjan4AxX5JFG223VwKhlfBIQokmMH5F", "Qt5tltWJjiKcHVLLbGsBdffUrcF61Y4NeRTZLQPykHE=", go0Var, i, 48);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xf2
    /* JADX INFO: renamed from: a */
    public final void mo5770a() throws IllegalAccessException, InvocationTargetException {
        this.f21525d.m7007r(hd1.ENUM_FAILURE);
        boolean zBooleanValue = ((Boolean) this.f21526e.invoke(null, this.f21522a.f17947b)).booleanValue();
        synchronized (this.f21525d) {
            try {
                if (zBooleanValue) {
                    this.f21525d.m7007r(hd1.ENUM_TRUE);
                } else {
                    this.f21525d.m7007r(hd1.ENUM_FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
