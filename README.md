RelativeLayouts
===============

Relative layouts is a simple library that makes it easier to create relative layouts in Android.

Usage
=====

Create a builder for a certain view and apply the wanted properties.

```java
    TextView actionTextView = (TextView) findViewById(R.id.TimelineActionTextView);
    ImageView actionViewBubble = (ImageView) findViewById(R.id.TimelineActionBubble);
    RelativeLayouts.Builder builder;

    if (rightAlign) {
      builder = new Builder(actionViewBubble, true, true);
      builder.alignParentBottom().alignParentLeft().apply();

      builder = new Builder(actionTextView, true, true);
      builder.alignParentBottom().rightOf(actionViewBubble).apply();
    }else{
      builder = new Builder(actionViewBubble, true, true);
      builder.alignParentBottom().alignParentRight().apply();

      builder = new Builder(actionTextView, true, true);
      builder.alignParentBottom().leftOf(actionViewBubble).apply();
    }
```

Or create a builder and apply properties on one line:

```java
    TextView actionTextView = (TextView) findViewById(R.id.TimelineActionTextView);

    new Builder(actionTextView, true, true).alignParentTop().alignParentRight().apply();
```

Developed By
============

* Henrik Sandström @ [Wrapp](http://www.wrapp.com)

License
=======
This project is licensed under the MIT License:

Copyright (c) 2012 Bohemian Wrappsody AB

Permission is hereby granted, free of charge, to any person obtaining a copy of
this software and associated documentation files (the "Software"), to deal in
the Software without restriction, including without limitation the rights to
use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
the Software, and to permit persons to whom the Software is furnished to do so,
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.  IN NO EVENT SHALL THE AUTHORS OR
COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
