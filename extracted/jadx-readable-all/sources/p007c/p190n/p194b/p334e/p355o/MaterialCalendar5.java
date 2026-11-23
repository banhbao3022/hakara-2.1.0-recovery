package p007c.p190n.p194b.p334e.p355o;

import android.view.View;

/* JADX INFO: renamed from: c.n.b.e.o.k, reason: use source file name */
/* JADX INFO: compiled from: MaterialCalendar.java */
/* JADX INFO: loaded from: classes.dex */
public class MaterialCalendar5 implements View.OnClickListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ MaterialCalendar f25258f;

    public MaterialCalendar5(MaterialCalendar materialCalendar) {
        this.f25258f = materialCalendar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        MaterialCalendar materialCalendar = this.f25258f;
        int i = materialCalendar.f25240i0;
        if (i == 2) {
            materialCalendar.m11226a1(1);
        } else if (i == 1) {
            materialCalendar.m11226a1(2);
        }
    }
}
