package p007c.p190n.p194b.p209b;

/* JADX INFO: renamed from: c.n.b.b.j1, reason: use source file name */
/* JADX INFO: compiled from: RendererConfiguration.java */
/* JADX INFO: loaded from: classes.dex */
public final class RendererConfiguration {

    /* JADX INFO: renamed from: a */
    public static final RendererConfiguration f6664a = new RendererConfiguration(false);

    /* JADX INFO: renamed from: b */
    public final boolean f6665b;

    public RendererConfiguration(boolean z) {
        this.f6665b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && RendererConfiguration.class == obj.getClass() && this.f6665b == ((RendererConfiguration) obj).f6665b;
    }

    public int hashCode() {
        return !this.f6665b ? 1 : 0;
    }
}
