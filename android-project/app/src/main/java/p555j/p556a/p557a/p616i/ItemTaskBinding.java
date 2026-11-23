package p555j.p556a.p557a.p616i;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import mtp.media.karaoke.data.model.Task;

/* JADX INFO: renamed from: j.a.a.i.c2, reason: use source file name */
/* JADX INFO: compiled from: ItemTaskBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ItemTaskBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: t */
    public final TextView f32450t;

    /* JADX INFO: renamed from: u */
    public final AppCompatImageView f32451u;

    /* JADX INFO: renamed from: v */
    public final RecyclerView f32452v;

    /* JADX INFO: renamed from: w */
    public final RelativeLayout f32453w;

    /* JADX INFO: renamed from: x */
    public Task f32454x;

    public ItemTaskBinding(Object obj, View view, int i, TextView textView, AppCompatImageView appCompatImageView, LinearLayout linearLayout, RecyclerView recyclerView, RelativeLayout relativeLayout) {
        super(obj, view, i);
        this.f32450t = textView;
        this.f32451u = appCompatImageView;
        this.f32452v = recyclerView;
        this.f32453w = relativeLayout;
    }
}
