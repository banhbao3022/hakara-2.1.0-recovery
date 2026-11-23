package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class bq0 implements j82 {

    /* JADX INFO: renamed from: a */
    public static final j82 f12775a = new bq0();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j82
    /* JADX INFO: renamed from: b */
    public final boolean mo5728b(int i) {
        cr0 cr0Var;
        switch (i) {
            case 0:
                cr0Var = cr0.DEBUGGER_STATE_UNSPECIFIED;
                break;
            case 1:
                cr0Var = cr0.DEBUGGER_STATE_NOT_INSTALLED;
                break;
            case 2:
                cr0Var = cr0.DEBUGGER_STATE_INSTALLED;
                break;
            case 3:
                cr0Var = cr0.DEBUGGER_STATE_ACTIVE;
                break;
            case 4:
                cr0Var = cr0.DEBUGGER_STATE_ENVVAR;
                break;
            case 5:
                cr0Var = cr0.DEBUGGER_STATE_MACHPORT;
                break;
            case 6:
                cr0Var = cr0.DEBUGGER_STATE_ENVVAR_MACHPORT;
                break;
            default:
                cr0Var = null;
                break;
        }
        return cr0Var != null;
    }
}
