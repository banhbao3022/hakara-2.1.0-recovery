package p636z0.p725k.p742m;

import android.widget.ListView;

/* JADX INFO: renamed from: z0.k.m.c, reason: use source file name */
/* JADX INFO: compiled from: ListViewAutoScrollHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class ListViewAutoScrollHelper extends AutoScrollHelper {

    /* JADX INFO: renamed from: w */
    public final ListView f38128w;

    public ListViewAutoScrollHelper(ListView listView) {
        super(listView);
        this.f38128w = listView;
    }

    @Override // p636z0.p725k.p742m.AutoScrollHelper
    /* JADX INFO: renamed from: a */
    public boolean mo16353a(int i) {
        return false;
    }

    @Override // p636z0.p725k.p742m.AutoScrollHelper
    /* JADX INFO: renamed from: b */
    public boolean mo16354b(int i) {
        ListView listView = this.f38128w;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // p636z0.p725k.p742m.AutoScrollHelper
    /* JADX INFO: renamed from: i */
    public void mo16358i(int i, int i2) {
        this.f38128w.scrollListBy(i2);
    }
}
