package p636z0.p770y;

import android.os.Bundle;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p636z0.p770y.NavDestination;

/* JADX INFO: renamed from: z0.y.q, reason: use source file name */
/* JADX INFO: compiled from: Navigator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class Navigator<D extends NavDestination> {

    /* JADX INFO: renamed from: z0.y.q$a */
    /* JADX INFO: compiled from: Navigator.java */
    public interface a {
    }

    /* JADX INFO: renamed from: z0.y.q$b */
    /* JADX INFO: compiled from: Navigator.java */
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
        String value();
    }

    /* JADX INFO: renamed from: a */
    public abstract D mo457a();

    /* JADX INFO: renamed from: b */
    public abstract NavDestination mo458b(D d, Bundle bundle, NavOptions navOptions, a aVar);

    /* JADX INFO: renamed from: c */
    public void mo459c(Bundle bundle) {
    }

    /* JADX INFO: renamed from: d */
    public Bundle mo460d() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo461e();
}
