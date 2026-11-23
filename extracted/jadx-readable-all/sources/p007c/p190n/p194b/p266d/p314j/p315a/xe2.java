package p007c.p190n.p194b.p266d.p314j.p315a;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class xe2 extends xf2 {
    public xe2(pe2 pe2Var, String str, String str2, go0 go0Var, int i, int i2) {
        super(pe2Var, "p3Z3ZqZKo17onS4HiiEtpoGwRIBviLad/ZdN5J9oBr9KBduQsBv0bePYyi9xIk1Y", "iFXNP6ElZKxf5HXZJFDnSU66PfDdP3IuIwL5oCTFkB0=", go0Var, i, 49);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xf2
    /* JADX INFO: renamed from: a */
    public final void mo5770a() throws IllegalAccessException, InvocationTargetException {
        go0 go0Var = this.f21525d;
        hd1 hd1Var = hd1.ENUM_FAILURE;
        if (go0Var.f13191h) {
            go0Var.m6298m();
            go0Var.f13191h = false;
        }
        f31.m6728O((f31) go0Var.f13190g, hd1Var);
        try {
            boolean zBooleanValue = ((Boolean) this.f21526e.invoke(null, this.f21522a.f17947b)).booleanValue();
            go0 go0Var2 = this.f21525d;
            hd1 hd1Var2 = zBooleanValue ? hd1.ENUM_TRUE : hd1.ENUM_FALSE;
            if (go0Var2.f13191h) {
                go0Var2.m6298m();
                go0Var2.f13191h = false;
            }
            f31.m6728O((f31) go0Var2.f13190g, hd1Var2);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
