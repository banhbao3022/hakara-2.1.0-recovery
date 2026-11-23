package p555j.p556a.p557a.p616i;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.data.model.Song;

/* JADX INFO: renamed from: j.a.a.i.a2, reason: use source file name */
/* JADX INFO: compiled from: ItemSongBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ItemSongBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: t */
    public final TextView f32390t;

    /* JADX INFO: renamed from: u */
    public final TextView f32391u;

    /* JADX INFO: renamed from: v */
    public final TextView f32392v;

    /* JADX INFO: renamed from: w */
    public final TextView f32393w;

    /* JADX INFO: renamed from: x */
    public final RelativeLayout f32394x;

    /* JADX INFO: renamed from: y */
    public final AppCompatImageView f32395y;

    /* JADX INFO: renamed from: z */
    public Song f32396z;

    public ItemSongBinding(Object obj, View view, int i, TextView textView, TextView textView2, LinearLayout linearLayout, TextView textView3, TextView textView4, RelativeLayout relativeLayout, AppCompatImageView appCompatImageView) {
        super(obj, view, i);
        this.f32390t = textView;
        this.f32391u = textView2;
        this.f32392v = textView3;
        this.f32393w = textView4;
        this.f32394x = relativeLayout;
        this.f32395y = appCompatImageView;
    }
}
