package p007c.p190n.p194b.p334e.p338c0;

import android.widget.AutoCompleteTextView;

/* JADX INFO: renamed from: c.n.b.e.c0.k, reason: use source file name */
/* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
/* JADX INFO: loaded from: classes.dex */
public class DropdownMenuEndIconDelegate4 implements AutoCompleteTextView.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DropdownMenuEndIconDelegate f24862a;

    public DropdownMenuEndIconDelegate4(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
        this.f24862a = dropdownMenuEndIconDelegate;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public void onDismiss() {
        DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = this.f24862a;
        dropdownMenuEndIconDelegate.f24841i = true;
        dropdownMenuEndIconDelegate.f24843k = System.currentTimeMillis();
        DropdownMenuEndIconDelegate.m11051f(this.f24862a, false);
    }
}
