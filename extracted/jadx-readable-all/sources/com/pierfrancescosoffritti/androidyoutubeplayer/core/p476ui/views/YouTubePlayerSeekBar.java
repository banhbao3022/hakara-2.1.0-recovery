package com.pierfrancescosoffritti.androidyoutubeplayer.core.p476ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import mtp.media.karaoke.R;
import p007c.p043b.p044a.C0344b;
import p007c.p043b.p044a.p045a.p046a.p049d.TimeUtilities;
import p007c.p043b.p044a.p045a.p046a.p050e.YouTubePlayerSeekBar2;
import p007c.p043b.p044a.p045a.p046a.p050e.YouTubePlayerSeekBar3;
import p007c.p043b.p044a.p045a.p051b.PlayerConstants;
import p007c.p043b.p044a.p045a.p051b.PlayerConstants2;
import p007c.p043b.p044a.p045a.p051b.PlayerConstants3;
import p007c.p043b.p044a.p045a.p051b.PlayerConstants4;
import p007c.p043b.p044a.p045a.p051b.YouTubePlayer;
import p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p636z0.p725k.p727d.ContextCompat;

/* JADX INFO: compiled from: YouTubePlayerSeekBar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class YouTubePlayerSeekBar extends LinearLayout implements SeekBar.OnSeekBarChangeListener, YouTubePlayerListener {

    /* JADX INFO: renamed from: f */
    public boolean f29321f;

    /* JADX INFO: renamed from: g */
    public int f29322g;

    /* JADX INFO: renamed from: h */
    public boolean f29323h;

    /* JADX INFO: renamed from: i */
    public boolean f29324i;

    /* JADX INFO: renamed from: j */
    public YouTubePlayerSeekBar3 f29325j;

    /* JADX INFO: renamed from: k */
    public final TextView f29326k;

    /* JADX INFO: renamed from: l */
    public final TextView f29327l;

    /* JADX INFO: renamed from: m */
    public final SeekBar f29328m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics2.m13090f(context, "context");
        this.f29322g = -1;
        this.f29324i = true;
        TextView textView = new TextView(context);
        this.f29326k = textView;
        TextView textView2 = new TextView(context);
        this.f29327l = textView2;
        SeekBar seekBar = new SeekBar(context);
        this.f29328m = seekBar;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C0344b.f1953a, 0, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, getResources().getDimensionPixelSize(R.dimen.ayp_12sp));
        int color = typedArrayObtainStyledAttributes.getColor(0, ContextCompat.m16134b(context, R.color.ayp_red));
        typedArrayObtainStyledAttributes.recycle();
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.ayp_8dp);
        textView.setText(getResources().getString(R.string.ayp_null_time));
        textView.setPadding(dimensionPixelSize2, dimensionPixelSize2, 0, dimensionPixelSize2);
        textView.setTextColor(ContextCompat.m16134b(context, android.R.color.white));
        textView.setGravity(16);
        textView2.setText(getResources().getString(R.string.ayp_null_time));
        textView2.setPadding(0, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        textView2.setTextColor(ContextCompat.m16134b(context, android.R.color.white));
        textView2.setGravity(16);
        setFontSize(dimensionPixelSize);
        int i = dimensionPixelSize2 * 2;
        seekBar.setPadding(i, dimensionPixelSize2, i, dimensionPixelSize2);
        setColor(color);
        addView(textView, new LinearLayout.LayoutParams(-2, -2));
        addView(seekBar, new LinearLayout.LayoutParams(0, -2, 1.0f));
        addView(textView2, new LinearLayout.LayoutParams(-2, -2));
        setGravity(16);
        seekBar.setOnSeekBarChangeListener(this);
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: a */
    public void mo1291a(YouTubePlayer youTubePlayer, float f) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
        if (this.f29321f) {
            return;
        }
        if (this.f29322g <= 0 || !(!Intrinsics2.m13085a(TimeUtilities.m1315a(f), TimeUtilities.m1315a(this.f29322g)))) {
            this.f29322g = -1;
            this.f29328m.setProgress((int) f);
        }
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: c */
    public void mo1293c(YouTubePlayer youTubePlayer, PlayerConstants2 playerConstants2) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
        Intrinsics2.m13090f(playerConstants2, "playbackRate");
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: d */
    public void mo1294d(YouTubePlayer youTubePlayer) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: f */
    public void mo1296f(YouTubePlayer youTubePlayer, String str) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
        Intrinsics2.m13090f(str, "videoId");
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: g */
    public void mo1297g(YouTubePlayer youTubePlayer, PlayerConstants4 playerConstants4) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
        Intrinsics2.m13090f(playerConstants4, "state");
        this.f29322g = -1;
        int iOrdinal = playerConstants4.ordinal();
        if (iOrdinal == 1) {
            this.f29328m.setProgress(0);
            this.f29328m.setMax(0);
            this.f29327l.post(new YouTubePlayerSeekBar2(this));
        } else if (iOrdinal == 2) {
            this.f29323h = false;
        } else if (iOrdinal == 3) {
            this.f29323h = true;
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.f29323h = false;
        }
    }

    public final SeekBar getSeekBar() {
        return this.f29328m;
    }

    public final boolean getShowBufferingProgress() {
        return this.f29324i;
    }

    public final TextView getVideoCurrentTimeTextView() {
        return this.f29326k;
    }

    public final TextView getVideoDurationTextView() {
        return this.f29327l;
    }

    public final YouTubePlayerSeekBar3 getYoutubePlayerSeekBarListener() {
        return this.f29325j;
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: h */
    public void mo1298h(YouTubePlayer youTubePlayer) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: k */
    public void mo1301k(YouTubePlayer youTubePlayer, PlayerConstants playerConstants) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
        Intrinsics2.m13090f(playerConstants, "playbackQuality");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        Intrinsics2.m13090f(seekBar, "seekBar");
        this.f29326k.setText(TimeUtilities.m1315a(i));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        Intrinsics2.m13090f(seekBar, "seekBar");
        this.f29321f = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        Intrinsics2.m13090f(seekBar, "seekBar");
        if (this.f29323h) {
            this.f29322g = seekBar.getProgress();
        }
        YouTubePlayerSeekBar3 youTubePlayerSeekBar3 = this.f29325j;
        if (youTubePlayerSeekBar3 != null) {
            youTubePlayerSeekBar3.seekTo(seekBar.getProgress());
        }
        this.f29321f = false;
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: q */
    public void mo1307q(YouTubePlayer youTubePlayer, float f) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
        if (!this.f29324i) {
            this.f29328m.setSecondaryProgress(0);
        } else {
            SeekBar seekBar = this.f29328m;
            seekBar.setSecondaryProgress((int) (f * seekBar.getMax()));
        }
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: s */
    public void mo1309s(YouTubePlayer youTubePlayer, PlayerConstants3 playerConstants3) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
        Intrinsics2.m13090f(playerConstants3, "error");
    }

    public final void setColor(int i) {
        this.f29328m.getThumb().setTint(i);
        this.f29328m.getProgressDrawable().setTint(i);
    }

    public final void setFontSize(float f) {
        this.f29326k.setTextSize(0, f);
        this.f29327l.setTextSize(0, f);
    }

    public final void setShowBufferingProgress(boolean z) {
        this.f29324i = z;
    }

    public final void setYoutubePlayerSeekBarListener(YouTubePlayerSeekBar3 youTubePlayerSeekBar3) {
        this.f29325j = youTubePlayerSeekBar3;
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: u */
    public void mo1311u(YouTubePlayer youTubePlayer, float f) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
        this.f29327l.setText(TimeUtilities.m1315a(f));
        this.f29328m.setMax((int) f);
    }

    public /* synthetic */ YouTubePlayerSeekBar(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
