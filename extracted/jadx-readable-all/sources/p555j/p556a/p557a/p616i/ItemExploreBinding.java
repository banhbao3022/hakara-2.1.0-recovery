package p555j.p556a.p557a.p616i;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import mtp.media.karaoke.data.model.Simple3;

/* JADX INFO: renamed from: j.a.a.i.a1, reason: use source file name */
/* JADX INFO: compiled from: ItemExploreBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ItemExploreBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: t */
    public final LinearLayout f32385t;

    /* JADX INFO: renamed from: u */
    public final View f32386u;

    /* JADX INFO: renamed from: v */
    public final ProgressBar f32387v;

    /* JADX INFO: renamed from: w */
    public final RecyclerView f32388w;

    /* JADX INFO: renamed from: x */
    public Simple3 f32389x;

    public ItemExploreBinding(Object obj, View view, int i, LinearLayout linearLayout, View view2, ProgressBar progressBar, RecyclerView recyclerView) {
        super(obj, view, i);
        this.f32385t = linearLayout;
        this.f32386u = view2;
        this.f32387v = progressBar;
        this.f32388w = recyclerView;
    }
}
