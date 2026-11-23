package p555j.p556a.p557a.p616i;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.data.model.Notification;

/* JADX INFO: renamed from: j.a.a.i.m1, reason: use source file name */
/* JADX INFO: compiled from: ItemNotificationBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ItemNotificationBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: t */
    public final ImageView f32672t;

    /* JADX INFO: renamed from: u */
    public final TextView f32673u;

    /* JADX INFO: renamed from: v */
    public final TextView f32674v;

    /* JADX INFO: renamed from: w */
    public final LinearLayout f32675w;

    /* JADX INFO: renamed from: x */
    public final AppCompatImageView f32676x;

    /* JADX INFO: renamed from: y */
    public Notification f32677y;

    public ItemNotificationBinding(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2, LinearLayout linearLayout, AppCompatImageView appCompatImageView) {
        super(obj, view, i);
        this.f32672t = imageView;
        this.f32673u = textView;
        this.f32674v = textView2;
        this.f32675w = linearLayout;
        this.f32676x = appCompatImageView;
    }
}
