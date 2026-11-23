package p636z0.p644b.p653h;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p725k.p727d.ContextCompat;
import p636z0.p743l.p744a.ResourceCursorAdapter;

/* JADX INFO: renamed from: z0.b.h.s0, reason: use source file name */
/* JADX INFO: compiled from: SuggestionsAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class SuggestionsAdapter extends ResourceCursorAdapter implements View.OnClickListener {

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ int f35177q = 0;

    /* JADX INFO: renamed from: A */
    public int f35178A;

    /* JADX INFO: renamed from: B */
    public int f35179B;

    /* JADX INFO: renamed from: C */
    public int f35180C;

    /* JADX INFO: renamed from: D */
    public int f35181D;

    /* JADX INFO: renamed from: r */
    public final SearchView f35182r;

    /* JADX INFO: renamed from: s */
    public final SearchableInfo f35183s;

    /* JADX INFO: renamed from: t */
    public final Context f35184t;

    /* JADX INFO: renamed from: u */
    public final WeakHashMap<String, Drawable.ConstantState> f35185u;

    /* JADX INFO: renamed from: v */
    public final int f35186v;

    /* JADX INFO: renamed from: w */
    public int f35187w;

    /* JADX INFO: renamed from: x */
    public ColorStateList f35188x;

    /* JADX INFO: renamed from: y */
    public int f35189y;

    /* JADX INFO: renamed from: z */
    public int f35190z;

    /* JADX INFO: renamed from: z0.b.h.s0$a */
    /* JADX INFO: compiled from: SuggestionsAdapter.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final TextView f35191a;

        /* JADX INFO: renamed from: b */
        public final TextView f35192b;

        /* JADX INFO: renamed from: c */
        public final ImageView f35193c;

        /* JADX INFO: renamed from: d */
        public final ImageView f35194d;

        /* JADX INFO: renamed from: e */
        public final ImageView f35195e;

        public a(View view) {
            this.f35191a = (TextView) view.findViewById(R.id.text1);
            this.f35192b = (TextView) view.findViewById(R.id.text2);
            this.f35193c = (ImageView) view.findViewById(R.id.icon1);
            this.f35194d = (ImageView) view.findViewById(R.id.icon2);
            this.f35195e = (ImageView) view.findViewById(mtp.media.karaoke.R.id.edit_query);
        }
    }

    public SuggestionsAdapter(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f35187w = 1;
        this.f35189y = -1;
        this.f35190z = -1;
        this.f35178A = -1;
        this.f35179B = -1;
        this.f35180C = -1;
        this.f35181D = -1;
        this.f35182r = searchView;
        this.f35183s = searchableInfo;
        this.f35186v = searchView.getSuggestionCommitIconResId();
        this.f35184t = context;
        this.f35185u = weakHashMap;
    }

    /* JADX INFO: renamed from: q */
    public static String m14952q(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    @Override // p636z0.p743l.p744a.CursorAdapter, p636z0.p743l.p744a.CursorFilter.a
    /* JADX INFO: renamed from: a */
    public void mo14953a(Cursor cursor) {
        try {
            super.mo14953a(cursor);
            if (cursor != null) {
                this.f35189y = cursor.getColumnIndex("suggest_text_1");
                this.f35190z = cursor.getColumnIndex("suggest_text_2");
                this.f35178A = cursor.getColumnIndex("suggest_text_2_url");
                this.f35179B = cursor.getColumnIndex("suggest_icon_1");
                this.f35180C = cursor.getColumnIndex("suggest_icon_2");
                this.f35181D = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // p636z0.p743l.p744a.CursorAdapter, p636z0.p743l.p744a.CursorFilter.a
    /* JADX INFO: renamed from: b */
    public CharSequence mo14954b(Cursor cursor) {
        String strM14952q;
        String strM14952q2;
        if (cursor == null) {
            return null;
        }
        String strM14952q3 = m14952q(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strM14952q3 != null) {
            return strM14952q3;
        }
        if (this.f35183s.shouldRewriteQueryFromData() && (strM14952q2 = m14952q(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strM14952q2;
        }
        if (!this.f35183s.shouldRewriteQueryFromText() || (strM14952q = m14952q(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strM14952q;
    }

    @Override // p636z0.p743l.p744a.CursorAdapter, p636z0.p743l.p744a.CursorFilter.a
    /* JADX INFO: renamed from: c */
    public Cursor mo14955c(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f35182r.getVisibility() == 0 && this.f35182r.getWindowVisibility() == 0) {
            try {
                Cursor cursorM14960o = m14960o(this.f35183s, string, 50);
                if (cursorM14960o != null) {
                    cursorM14960o.getCount();
                    return cursorM14960o;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    @Override // p636z0.p743l.p744a.CursorAdapter
    /* JADX INFO: renamed from: d */
    public void mo14956d(View view, Context context, Cursor cursor) throws FileNotFoundException {
        Drawable drawableM14959m;
        Drawable drawable;
        CharSequence charSequenceM14952q;
        a aVar = (a) view.getTag();
        int i = this.f35181D;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.f35191a != null) {
            String strM14952q = m14952q(cursor, this.f35189y);
            TextView textView = aVar.f35191a;
            textView.setText(strM14952q);
            if (TextUtils.isEmpty(strM14952q)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        if (aVar.f35192b != null) {
            String strM14952q2 = m14952q(cursor, this.f35178A);
            if (strM14952q2 != null) {
                if (this.f35188x == null) {
                    TypedValue typedValue = new TypedValue();
                    this.f35184t.getTheme().resolveAttribute(mtp.media.karaoke.R.attr.textColorSearchUrl, typedValue, true);
                    this.f35188x = this.f35184t.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(strM14952q2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f35188x, null), 0, strM14952q2.length(), 33);
                charSequenceM14952q = spannableString;
            } else {
                charSequenceM14952q = m14952q(cursor, this.f35190z);
            }
            if (TextUtils.isEmpty(charSequenceM14952q)) {
                TextView textView2 = aVar.f35191a;
                if (textView2 != null) {
                    textView2.setSingleLine(false);
                    aVar.f35191a.setMaxLines(2);
                }
            } else {
                TextView textView3 = aVar.f35191a;
                if (textView3 != null) {
                    textView3.setSingleLine(true);
                    aVar.f35191a.setMaxLines(1);
                }
            }
            TextView textView4 = aVar.f35192b;
            textView4.setText(charSequenceM14952q);
            if (TextUtils.isEmpty(charSequenceM14952q)) {
                textView4.setVisibility(8);
            } else {
                textView4.setVisibility(0);
            }
        }
        ImageView imageView = aVar.f35193c;
        if (imageView != null) {
            int i3 = this.f35179B;
            if (i3 == -1) {
                drawableM14959m = null;
            } else {
                drawableM14959m = m14959m(cursor.getString(i3));
                if (drawableM14959m == null) {
                    ComponentName searchActivity = this.f35183s.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    if (this.f35185u.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState = this.f35185u.get(strFlattenToShortString);
                        drawableM14959m = constantState == null ? null : constantState.newDrawable(this.f35184t.getResources());
                    } else {
                        PackageManager packageManager = this.f35184t.getPackageManager();
                        try {
                            ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            int iconResource = activityInfo.getIconResource();
                            if (iconResource != 0) {
                                drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                                if (drawable == null) {
                                    StringBuilder sbM1557H = outline.m1557H("Invalid icon resource ", iconResource, " for ");
                                    sbM1557H.append(searchActivity.flattenToShortString());
                                    Log.w("SuggestionsAdapter", sbM1557H.toString());
                                    drawable = null;
                                }
                            } else {
                                drawable = null;
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.w("SuggestionsAdapter", e.toString());
                        }
                        this.f35185u.put(strFlattenToShortString, drawable == null ? null : drawable.getConstantState());
                        drawableM14959m = drawable;
                    }
                    if (drawableM14959m == null) {
                        drawableM14959m = this.f35184t.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(drawableM14959m);
            if (drawableM14959m == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                drawableM14959m.setVisible(false, false);
                drawableM14959m.setVisible(true, false);
            }
        }
        ImageView imageView2 = aVar.f35194d;
        if (imageView2 != null) {
            int i4 = this.f35180C;
            Drawable drawableM14959m2 = i4 == -1 ? null : m14959m(cursor.getString(i4));
            imageView2.setImageDrawable(drawableM14959m2);
            if (drawableM14959m2 == null) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                drawableM14959m2.setVisible(false, false);
                drawableM14959m2.setVisible(true, false);
            }
        }
        int i5 = this.f35187w;
        if (i5 != 2 && (i5 != 1 || (i2 & 1) == 0)) {
            aVar.f35195e.setVisibility(8);
            return;
        }
        aVar.f35195e.setVisibility(0);
        aVar.f35195e.setTag(aVar.f35191a.getText());
        aVar.f35195e.setOnClickListener(this);
    }

    @Override // p636z0.p743l.p744a.CursorAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewInflate = this.f38148p.inflate(this.f38147o, viewGroup, false);
            if (viewInflate != null) {
                ((a) viewInflate.getTag()).f35191a.setText(e.toString());
            }
            return viewInflate;
        }
    }

    @Override // p636z0.p743l.p744a.CursorAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewMo14957i = mo14957i(this.f35184t, this.f38137h, viewGroup);
            ((a) viewMo14957i.getTag()).f35191a.setText(e.toString());
            return viewMo14957i;
        }
    }

    @Override // p636z0.p743l.p744a.ResourceCursorAdapter, p636z0.p743l.p744a.CursorAdapter
    /* JADX INFO: renamed from: i */
    public View mo14957i(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewInflate = this.f38148p.inflate(this.f38146n, viewGroup, false);
        viewInflate.setTag(new a(viewInflate));
        ((ImageView) viewInflate.findViewById(mtp.media.karaoke.R.id.edit_query)).setImageResource(this.f35186v);
        return viewInflate;
    }

    /* JADX INFO: renamed from: l */
    public Drawable m14958l(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException(outline.m1596r("No authority: ", uri));
        }
        try {
            Resources resourcesForApplication = this.f35184t.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException(outline.m1596r("No path: ", uri));
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException(outline.m1596r("Single path segment is not a resource ID: ", uri));
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException(outline.m1596r("More than two path segments: ", uri));
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException(outline.m1596r("No resource found for: ", uri));
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException(outline.m1596r("No package found for authority: ", uri));
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0125  */
    /* JADX INFO: renamed from: m */
    public final Drawable m14959m(String str) throws FileNotFoundException {
        Drawable drawableM14958l = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i = Integer.parseInt(str);
                String str2 = "android.resource://" + this.f35184t.getPackageName() + "/" + i;
                Drawable.ConstantState constantState = this.f35185u.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Context context = this.f35184t;
                Object obj = ContextCompat.f37815a;
                Drawable drawableM16141b = ContextCompat.c.m16141b(context, i);
                if (drawableM16141b != null) {
                    this.f35185u.put(str2, drawableM16141b.getConstantState());
                }
                return drawableM16141b;
            } catch (Resources.NotFoundException unused) {
                outline.m1567R("Icon resource not found: ", str, "SuggestionsAdapter");
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = this.f35185u.get(str);
                Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (drawableNewDrawable2 != null) {
                    return drawableNewDrawable2;
                }
                Uri uri = Uri.parse(str);
                try {
                    if ("android.resource".equals(uri.getScheme())) {
                        try {
                            drawableM14958l = m14958l(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = this.f35184t.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e);
                            }
                            drawableM14958l = drawableCreateFromStream;
                        } catch (Throwable th) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e2) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e2);
                            }
                            throw th;
                        }
                    }
                } catch (FileNotFoundException e3) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
                    if (drawableM14958l != null) {
                        this.f35185u.put(str, drawableM14958l.getConstantState());
                    }
                    return drawableM14958l;
                }
                if (drawableM14958l != null) {
                    this.f35185u.put(str, drawableM14958l.getConstantState());
                }
            }
        }
        return drawableM14958l;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m14961r(this.f38137h);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m14961r(this.f38137h);
    }

    /* JADX INFO: renamed from: o */
    public Cursor m14960o(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f35184t.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f35182r.m211x((CharSequence) tag);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m14961r(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }
}
