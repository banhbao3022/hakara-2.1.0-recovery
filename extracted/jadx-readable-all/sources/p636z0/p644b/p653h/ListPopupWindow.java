package p636z0.p644b.p653h;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: z0.b.h.j0, reason: use source file name */
/* JADX INFO: compiled from: ListPopupWindow.java */
/* JADX INFO: loaded from: classes.dex */
public class ListPopupWindow implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ListPopupWindow2 f35078f;

    public ListPopupWindow(ListPopupWindow2 listPopupWindow2) {
        this.f35078f = listPopupWindow2;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j2) {
        DropDownListView dropDownListView;
        if (i == -1 || (dropDownListView = this.f35078f.f35096k) == null) {
            return;
        }
        dropDownListView.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
