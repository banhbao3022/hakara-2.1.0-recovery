package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public enum cr0 implements i82 {
    DEBUGGER_STATE_UNSPECIFIED(0),
    DEBUGGER_STATE_NOT_INSTALLED(1),
    DEBUGGER_STATE_INSTALLED(2),
    DEBUGGER_STATE_ACTIVE(3),
    DEBUGGER_STATE_ENVVAR(4),
    DEBUGGER_STATE_MACHPORT(5),
    DEBUGGER_STATE_ENVVAR_MACHPORT(6);


    /* JADX INFO: renamed from: n */
    public final int f13099n;

    cr0(int i) {
        this.f13099n = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + cr0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f13099n + " name=" + name() + '>';
    }
}
