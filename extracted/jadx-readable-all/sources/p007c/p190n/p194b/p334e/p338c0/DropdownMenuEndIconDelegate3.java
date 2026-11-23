package p007c.p190n.p194b.p334e.p338c0;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* JADX INFO: renamed from: c.n.b.e.c0.j, reason: use source file name */
/* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
/* JADX INFO: loaded from: classes.dex */
public class DropdownMenuEndIconDelegate3 implements View.OnTouchListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AutoCompleteTextView f24860f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ DropdownMenuEndIconDelegate f24861g;

    public DropdownMenuEndIconDelegate3(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate, AutoCompleteTextView autoCompleteTextView) {
        this.f24861g = dropdownMenuEndIconDelegate;
        this.f24860f = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f24861g.m11055i()) {
                this.f24861g.f24841i = false;
            }
            DropdownMenuEndIconDelegate.m11052g(this.f24861g, this.f24860f);
        }
        return false;
    }
}
