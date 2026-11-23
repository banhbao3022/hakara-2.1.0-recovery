package p007c.p190n.p194b.p334e.p355o;

import android.view.View;

/* JADX INFO: renamed from: c.n.b.e.o.o, reason: use source file name */
/* JADX INFO: compiled from: MaterialDatePicker.java */
/* JADX INFO: loaded from: classes.dex */
public class MaterialDatePicker2 implements View.OnClickListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ MaterialDatePicker f25284f;

    public MaterialDatePicker2(MaterialDatePicker materialDatePicker) {
        this.f25284f = materialDatePicker;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        MaterialDatePicker materialDatePicker = this.f25284f;
        materialDatePicker.f25273J0.setEnabled(materialDatePicker.f25279y0.m11220y());
        this.f25284f.f25271H0.toggle();
        MaterialDatePicker materialDatePicker2 = this.f25284f;
        materialDatePicker2.m11232i1(materialDatePicker2.f25271H0);
        this.f25284f.m11230g1();
    }
}
